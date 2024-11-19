package org.message;

public class MessageHandler {

    private final Message messageStrategy;

    public MessageHandler (Message messageStrategy) {
        this.messageStrategy = messageStrategy;
    }

    public void sendMessage(String message) {
        messageStrategy.sendMessage(message);
    }

}
