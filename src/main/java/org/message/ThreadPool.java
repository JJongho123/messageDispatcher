//package org.message;
//
//import java.util.concurrent.BlockingQueue;
//import java.util.concurrent.Executor;
//import java.util.concurrent.LinkedTransferQueue;
//
///**
// * ThreadPool 클래스는 사용자 지정 크기의 스레드풀을 관리하며,
// * 작업을 병렬로 처리할 수 있도록 설계되었습니다.
// */
//public class ThreadPool implements Executor{
//
//    private final BlockingQueue<Runnable> queue= new LinkedTransferQueue<>();
//
//    /**
//     * 지정된 크기의 스레드풀을 초기화하고 각 스레드에서 작업 큐를 처리합니다.
//     *
//     * @param numThreads 스레드풀의 크기
//     */
//    public ThreadPool(int numThreads) {
//
//        Thread[] threads = new Thread[numThreads];
//        for (int i = 0; i < numThreads; i++) {
//            threads[i]=new Thread(()->{
//                try {
//                    for(;;) {
//                        // 작업 큐에서 작업을 가져와 실행
//                        final Runnable task = queue.take();
//                        task.run();
//                    }
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            });
//            threads[i].start();
//        }
//    }
//
//    /**
//     * 작업 큐에 새로운 Runnable 작업을 추가합니다.
//     *
//     * @param command 실행할 Runnable 작업
//     */
//    @Override
//    public void execute(Runnable command) {
//        queue.add(command);
//    }
//}
