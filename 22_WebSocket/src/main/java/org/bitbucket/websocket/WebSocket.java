package org.bitbucket.websocket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebSocket {

    public static Thread thread;

    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
        WSThread webSocket = new WSThread();
        thread = new Thread(webSocket,"WS server#");
        System.out.println(thread.getName());
        thread.start();
    }
}