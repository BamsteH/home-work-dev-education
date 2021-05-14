package org.bitbucket.http_with_nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class SimpleHttpResponse {

    private final SocketChannel socketChannel;

    private final ByteBuffer byteBuffer;

    public SimpleHttpResponse(SocketChannel socketChannel, HttpHandler httpHandler, ByteBuffer byteBuffer) {
        this.socketChannel = socketChannel;
        this.byteBuffer = byteBuffer;
        this.makeResponse(httpHandler.getResponce(), httpHandler.getHtmlPage());
    }

    private void makeResponse(String response, String html) {
        try {
            System.out.println(response + html);
            this.send(response);
            this.send(html);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void send(String input) throws IOException {
        byte[] bytes = input.getBytes();
        int capacity = Math.min(this.byteBuffer.capacity(), bytes.length);
        int pointer = 0;
        do {
            ByteBuffer response = ByteBuffer.wrap(bytes);
            this.socketChannel.write(response);
            pointer += capacity;
        } while (bytes.length - pointer >= capacity);
    }

}
