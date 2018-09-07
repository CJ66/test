package com.emrubik.thread.s10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Threadpools1{
    /**
     * 我们获取四次次线程，观察4个线程地址
     *
     * @param args
     */
    public static void main(String[] args) {
        /**
         * 创建一个可缓存线程池，应用中存在的线程数可以无限大
         */
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        System.out.println("****************************newCachedThreadPool*******************************");
        for (int i = 0; i < 4; i++) {
            final int index = i;
            newCachedThreadPool.execute(new ThreadForpools(index));
        }
    }
}
