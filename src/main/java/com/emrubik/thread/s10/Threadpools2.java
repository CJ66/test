package com.emrubik.thread.s10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Threadpools2 {
    /**
     * 我们获取四次次线程，观察4个线程地址
     *
     * @param args
     */
    public static void main(String[] args) {
        /**
         * 创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列中等待。
         * 每次只有两个线程在处理，当第一个线程执行完毕后，新的线程进来开始处理（线程地址不一样）
         */
        //线程池允许同时存在两个线程
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(2);
        System.out.println("****************************newFixedThreadPool*******************************");
        for (int i = 0; i < 4; i++) {
            final int index = i;
            newFixedThreadPool.execute(new ThreadForpools(index));
        }
    }
}
