package com.devops.microservice.models;

public class DevOps {
    private final String content;
    private final String message = new String("This is a test");
    private final String to = new String("Juan Perez");
    private final String from = new String("Rita Asturia");
    private final String timeToLifeSec = new String("45");

    public DevOps(String content) {
        this.content = content;
    }
    public String getMessage() {
        return message;
    }
    public String getTo() {
        return to;
    }
    public String getFrom() {
        return from;
    }
    public String getTimeToLifeSec() {
        return timeToLifeSec;
    }
}
