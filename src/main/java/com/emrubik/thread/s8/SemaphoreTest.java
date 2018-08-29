package com.emrubik.thread.s8;

import java.util.concurrent.*;

public class SemaphoreTest {
    private static final int THREAD_COUNT = 30;
    private static ExecutorService threadPool = Executors.newFixedThreadPool(THREAD_COUNT);
    private static Semaphore s = new Semaphore(10);
//    static CyclicBarrier c = new CyclicBarrier(30);
    public static void main(String[] args) {
        for (int i = 0; i < THREAD_COUNT; i++) {
            threadPool.execute(new Runnable() {
                @Override
                public void run() {
                    try {
//                        System.out.println("await   -----");
//                        c.await();
                        s.acquire();
                        System.out.println("信号量中当前可用的许可证数"+ s.availablePermits()
                                + "  等待获取许可证的线程数" + s.getQueueLength()
                                + "  是否有线程正在等待获取许可证" + s.hasQueuedThreads());
                        System.out.println(s.availablePermits());
                        TimeUnit.MILLISECONDS.sleep(1000);
                        System.out.println("save data" );
                        s.release();
                    } catch (Exception e) {
                    }
                }
            });
        }
        threadPool.shutdown();
    }
}
