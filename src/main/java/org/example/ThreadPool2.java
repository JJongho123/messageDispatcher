package org.example;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedTransferQueue;

public class ThreadPool2 implements Executor{

    private final BlockingQueue<Runnable> queue= new LinkedTransferQueue<>();
    private final Thread[] threads;

    public ThreadPool2(int numThreads) {

        threads = new Thread[numThreads];
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
