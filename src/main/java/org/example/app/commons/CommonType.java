package org.example.app.commons;

public enum CommonType {

    EXIT("exit"),
    NAME("Name"),
    NOT_FOUND("Nor found");

    private final String command;

    CommonType(String command) {
        this.command = command;
    }

    public String getCommand() {
        return command;
    }
}





