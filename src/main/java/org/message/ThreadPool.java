package org.message;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedTransferQueue;

public class ThreadPool implements Executor{

    private final BlockingQueue<Runnable> queue= new LinkedTransferQueue<>();

    public ThreadPool(int numThreads) {

        Thread[] threads = new Thread[numThreads];
        for (int i = 0; i < numThreads; i++) {
            threads[i]=new Thread(()->{
                try {
                    for(;;) {
                        final Runnable task = queue.take();
                        task.run();
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
            threads[i].start();
        }
    }
    @Override
    public void execute(Runnable command) {
        queue.add(command);
    }
}
