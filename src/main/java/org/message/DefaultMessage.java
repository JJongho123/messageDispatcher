package org.message;

/**
 * DefaultMessage 클래스는 Message 인터페이스의 기본 구현체입니다.
 * 메시지를 500ms 대기 후 표준 출력으로 출력합니다.
 */
public class DefaultMessage implements Message {

    /**
     * 메시지를 발송하는 메서드.
     *
     * @param msg 발송할 메시지
     */
    @Override
    public void sendMessage(String msg) {

        try{
            // 500ms 대기 후 메시지 출력
            Thread.sleep(500);
        }
        catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("보낸 메시지 출력 : " + msg);
    }
}
