//package org.message;
//
///**
// * MessageHandler 클래스는 메시지 발송 전략을 관리하며,
// * 전달받은 메시지를 처리하는 역할을 합니다.
// */
//public class MessageHandler {
//
//    private final Message messageStrategy;
//
//    /**
//     *
//     * @param messageStrategy 사용할 메시지 발송 전략
//     */
//    public MessageHandler (Message messageStrategy) {
//        this.messageStrategy = messageStrategy;
//    }
//
//    /**
//     * 메시지를 처리하고 발송하는 메서드.
//     *
//     * @param message 발송할 메시지
//     */
//    public void sendMessage(String message) {
//        messageStrategy.sendMessage(message);
//    }
//
//}
