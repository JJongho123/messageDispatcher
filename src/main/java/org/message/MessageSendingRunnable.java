package org.message;

public class MessageSendingRunnable  implements Runnable {
    MessageHandler  msgHandler;

    public MessageSendingRunnable (MessageHandler  msgHandler) {
        this.msgHandler = msgHandler;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(500);
                msgHandler.sendMessage("Hello World " + i);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
