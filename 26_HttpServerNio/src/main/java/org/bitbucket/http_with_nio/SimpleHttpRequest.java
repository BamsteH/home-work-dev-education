package org.bitbucket.http_with_nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class SimpleHttpRequest {

    private final String BODY_DELIMITER = "\n\r\n";

    private final SocketChannel socketChannel;

    private final ByteBuffer byteBuffer;

    private String request;

    private String body;

    private Type type;

    public SimpleHttpRequest(SocketChannel socketChannel, ByteBuffer byteBuffer) {
        this.byteBuffer = byteBuffer;
        this.socketChannel = socketChannel;
        setRequest();
        System.out.println("Type : " + this.type);
        System.out.println("Body : " + this.body);
    }

    private void setRequest() {
        StringBuilder result = new StringBuilder();
        try {
            int bytes;
            do {
                this.byteBuffer.clear();
                bytes = this.socketChannel.read(this.byteBuffer);
                this.byteBuffer.flip();
                String str = new String(this.byteBuffer.array());
                result.append(str);
                System.out.println("This length is " + str.length());
            } while (bytes == 512);
            byteBuffer.clear();
            if (bytes == -1) return;
            this.request = result.toString();
//            System.out.println(this.request);
            System.out.println("Request length is " + this.request.length());
            this.type = Type.getValue(this.request.substring(0, this.request.indexOf(' ')));
            this.body = this.request.substring(this.request.indexOf(BODY_DELIMITER) + 3);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public String getBody() {
        return body;
    }

    public Type getType() {
        return this.type;
    }

}
