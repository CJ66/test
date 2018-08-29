package com.emrubik.thread.s10;

import java.util.concurrent.*;

public class Threadpools3 {
    /**
     * 我们获取四次次线程，观察4个线程地址
     *
     * @param args
     */
    public static void main(String[] args) {
        /**
         * 创建一个定长线程池，支持定时及周期性任务执行。
         * 延迟三秒之后执行，除了延迟执行之外和newFixedThreadPool基本相同，可以用来执行定时任务
         */
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(2);
        System.out.println("****************************newFixedThreadPool*******************************");
        for (int i = 0; i < 4; i++) {
            final int index = i;
            //延迟三秒执行
            newScheduledThreadPool.schedule(new ThreadForpools(index), 3, TimeUnit.SECONDS);
        }
    }
}
