package org.bitbucket.websocket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WSThread implements Runnable {

    private final ExecutorService threadPool = Executors.newFixedThreadPool(2);

    @Override
    public void run() {
        ServerSocket server = null;
        try {
            server = new ServerSocket(80);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Socket client = server.accept();
            System.out.println("A client connected.");
            InputStream in = client.getInputStream();
            OutputStream out = client.getOutputStream();
            Scanner s = new Scanner(in, "UTF-8");
            System.out.println("Server has started on 127.0.0.1:80.\r\nWaiting for a connection...");
            threadPool.execute(() -> {
                try {
                    String data = s.useDelimiter("\\r\\n\\r\\n").next();
                    Matcher get = Pattern.compile("^GET").matcher(data);
                    if (get.find()) {
                        Matcher match = Pattern.compile("Sec-WebSocket-Key: (.*)").matcher(data);
                        match.find();
                        byte[] response = ("HTTP/1.1 101 Switching Protocols\r\n"
                                + "Connection: Upgrade\r\n"
                                + "Upgrade: websocket\r\n"
                                + "Sec-WebSocket-Accept: "
                                + Base64.getEncoder()
                                .encodeToString(MessageDigest.getInstance("SHA-1")
                                        .digest((match.group(1) + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11")
                                                .getBytes("UTF-8")))
                                + "\r\n\r\n").getBytes("UTF-8");
                        out.write(response, 0, response.length);
                        byte[] decoded = new byte[6];
                        byte[] encoded = new byte[]{(byte) 198, (byte) 131, (byte) 130, (byte) 182, (byte) 194, (byte) 135};
                        byte[] key = new byte[]{(byte) 167, (byte) 225, (byte) 225, (byte) 210};
                        for (int i = 0; i < encoded.length; i++) {
                            decoded[i] = (byte) (encoded[i] ^ key[i & 0x3]);
                        }
                    }
                } catch (NoSuchAlgorithmException | IOException e) {
                    e.printStackTrace();
                } finally {
                    s.close();
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                server.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
