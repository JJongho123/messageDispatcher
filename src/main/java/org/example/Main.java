package org.example;

public class Main {
    public static void main(String[] args) {

        MessageService messageService = new MessageService(new DisplayMessage());

        new Thread(new ThreadPool(messageService)).start();

        messageService.sendMessage("안녕");
        messageService.sendMessage("하이");
        messageService.sendMessage("잘가");


    }
}