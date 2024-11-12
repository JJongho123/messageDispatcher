package org.example;


public class ThreadPool implements Runnable{
    MessageService messageService;

    ThreadPool(MessageService messageService){
        this.messageService = messageService;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            messageService.sendMessage("Hello World");
        }

    }

}
