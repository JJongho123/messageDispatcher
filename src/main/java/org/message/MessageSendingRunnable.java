package org.message;

/**
 * 메시지를 순차적으로 발송하는 작업을 정의
 * Runnable 인터페이스를 구현하여 스레드에서 실행
 */
public class MessageSendingRunnable  implements Runnable {
    MessageHandler  msgHandler;

    /**
     * @param msgHandler 메시지 처리 핸들러.
     */
    public MessageSendingRunnable (MessageHandler  msgHandler) {
        this.msgHandler = msgHandler;
    }

    /**
     * 메시지를 순차적으로 발송하는 작업을 실행합니다.
     * 1초 간격으로 총 10개의 메시지를 발송합니다.
     */
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
