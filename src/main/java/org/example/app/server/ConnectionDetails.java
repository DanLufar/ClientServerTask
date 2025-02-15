package org.example.app.server;

import java.net.Socket;
import java.time.LocalDateTime;
import java.util.Objects;

public final class ConnectionDetails {

    private final String clientName;
    private final LocalDateTime connectedAt;
    private final Socket socket;

    public ConnectionDetails(String clientName, LocalDateTime connectedAt, Socket socket) {
        this.clientName = clientName;
        this.connectedAt = connectedAt;
        this.socket = socket;
    }

    public static ConnectionDetails of(final String clientName, final LocalDateTime connectedAt, final Socket socket){
        return new ConnectionDetails(clientName, connectedAt, socket);
    }

    public String getClientName() {
        return clientName;
    }

    public LocalDateTime getConnectedAt() {
        return connectedAt;
    }

    public Socket getSocket() {
        return socket;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ConnectionDetails that = (ConnectionDetails) o;
        return Objects.equals(clientName, that.clientName) && Objects.equals(connectedAt, that.connectedAt) && Objects.equals(socket, that.socket);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientName, connectedAt, socket);
    }

    @Override
    public String toString() {
        return "ConnectionDetails{" +
                "clientName='" + clientName + '\'' +
                ", connectedAt=" + connectedAt +
                ", socket=" + socket +
                '}';
    }
}
