package org.message;

/**
 * Message 인터페이스는 메시지 발송 방식을 정의
 */
interface Message {

    /**
     * 메시지를 발송하는 메서드.
     *
     * @param msg 발송할 메시지
     */
    void sendMessage(String msg);

}
