package org.example.app;

import org.example.app.server.Server;

public class ServerDemo {

    private final static int PORT = 8080;
    public static void main(String[] args) {
        Server.start(PORT);

    }
}
