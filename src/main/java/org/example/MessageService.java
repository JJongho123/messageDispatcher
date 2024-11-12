package org.example;

import java.util.HashMap;
import java.util.Objects;

public class MessageService{

    private final Message messageStrategy;

    public MessageService(Message messageStrategy) {
        this.messageStrategy = messageStrategy;
    }

    public void sendMessage(String message) {
        messageStrategy.sendMessage(message);
    }

}
