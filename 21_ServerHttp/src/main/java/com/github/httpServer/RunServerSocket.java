package com.github.httpServer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.ServerSocket;
import java.net.Socket;

public class RunServerSocket {


    public static void run() {
        try (ServerSocket serverSocket = new ServerSocket(8080)) {
            while (true) {
                try (Socket client = serverSocket.accept()) {
                    ServerHandler.handleClient(client);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
