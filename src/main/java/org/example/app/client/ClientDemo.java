package org.example.app.client;

import org.example.app.commons.CommonUtils;

public class ClientDemo {
    public static void main(String[] args) {
        var client = 5;
        for (int i = 0; i < client; i++) {
            Client.connectToServer();
        }
        CommonUtils.getClientName()
                .forEach(clentName ->
                        Client.sendCommandToServer("exit %s".formatted(clentName)));
    }
}
