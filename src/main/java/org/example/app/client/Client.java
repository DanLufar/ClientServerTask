package org.example.app.client;

import org.example.app.commons.CommonUtils;

import java.io.*;
import java.net.Socket;

public class Client {
    private static final String HOST = "localhost";
    private static final int PORT = 8080;

    public static void connectToServer() {
        try (var socket = new Socket(HOST, PORT);
             var socketOutputStream = socket.getOutputStream();
             var writer = new BufferedWriter(new PrintWriter(socketOutputStream))) {
            String clientName = CommonUtils.generateClientName();
            CommonUtils.getClientName().add(clientName);
            String connectionDetails = CommonUtils.generateConnectionDetails(clientName);
            writer.write(connectionDetails);
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void sendCommandToServer(final String command) {
        try (Socket socket = new Socket(HOST, PORT);
             OutputStreamWriter osw = new OutputStreamWriter(socket.getOutputStream());
             BufferedWriter writer = new BufferedWriter(osw)) {

            writer.write(command);
            writer.newLine();
            writer.flush();

        } catch (IOException e) {
            throw new RuntimeException("Error while sending command to the server", e);
        }
    }

}
