package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {

    public ThreadPool(int nThreads){
        ExecutorService executor = Executors.newFixedThreadPool(nThreads);

        for (int i = 0; i < nThreads; i++) {
            executor.execute(new Task());
        }

        executor.shutdown();
    }

    public class Task implements Runnable{

        @Override
        public void run() {

        }
    }

}
