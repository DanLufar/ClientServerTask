package org.example.app.server;

import org.example.app.commons.KeyValuePair;

import java.net.Socket;
import java.time.LocalDateTime;
import java.util.concurrent.Callable;

public class ConnectionHandler implements Callable<ConnectionDetails> {

    private final KeyValuePair<String, String>pair;
    private final Socket socket;

    public ConnectionHandler(KeyValuePair<String, String> pair, Socket socket) {
        this.pair = pair;
        this.socket = socket;
    }

    public ConnectionDetails call(){
        return ConnectionDetails.of(pair.getValue(),
                LocalDateTime.now(), socket);
    }
}
