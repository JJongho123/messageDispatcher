package org.example;

public class DisplayMessage implements Message {

    @Override
    public void sendMessage(String msg) {
        System.out.println("보낸 메시지 출력 : " + msg);
    }
}
