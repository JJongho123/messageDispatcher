package org.example;

public class DefaultMessage implements Message {

    @Override
    public void sendMessage(String msg) {

        try{
            Thread.sleep(500); // 500ms 대기 후 메시지 출력
        }
        catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("보낸 메시지 출력 : " + msg);
    }
}
