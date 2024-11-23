package org.message;

/**
 * 메시지 핸들러, 메시지 발송 Runnable, 그리고 스레드풀을 초기화하고 실행합니다.
 */
public class Main {
    public static void main(String[] args) {

        // 메시지 발송 방식 설정 (기본 메시지 발송 방식 사용)
        MessageHandler msgHandler = new MessageHandler(new DefaultMessage());

        MessageSendingRunnable  runnable = new MessageSendingRunnable(msgHandler);

        ThreadPool threadPool = new ThreadPool(5);
        threadPool.execute(runnable);


    }
}