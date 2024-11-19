package org.message;

public class Main {
    public static void main(String[] args) {

        MessageHandler msgHandler = new MessageHandler(new DefaultMessage());

        MessageSendingRunnable  runnable = new MessageSendingRunnable(msgHandler);

        ThreadPool threadPool = new ThreadPool(5);
        threadPool.execute(runnable);


    }
}