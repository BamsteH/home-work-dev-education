package org.bitbucket.http_with_nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class Server {

    private ServerSocketChannel serverSocketChannel;
    private int port;

    public Server(int port) {
        this.port = port;
        this.startServer();
        this.makeHttpConnection();
    }

    private void startServer() {
        try {
            this.serverSocketChannel = ServerSocketChannel.open();
            this.serverSocketChannel.bind(new InetSocketAddress(this.port));
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        System.out.println("Local server started with port : " + this.port);
    }

    private void makeHttpConnection() {
        while (true) {
            try {
                SocketChannel socketChannel = this.serverSocketChannel.accept();
                ByteBuffer byteBuffer = ByteBuffer.allocate(512);
                SimpleHttpRequest simpleHttpRequest = new SimpleHttpRequest(socketChannel, byteBuffer);
                SimpleHttpResponse simpleHttpResponse = new SimpleHttpResponse(socketChannel, new HttpHandler(simpleHttpRequest), byteBuffer);
//                socketChannel.finishConnect();
            } catch (IOException exception) {
                exception.printStackTrace();
            } finally {
                System.out.println("Socket was closed.");
            }
        }
    }
}
