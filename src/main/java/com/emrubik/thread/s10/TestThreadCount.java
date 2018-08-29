package com.emrubik.thread.s10;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class TestThreadCount {
    private static NewThreadPoolExecutor executorService = new NewThreadPoolExecutor(5);

    public static void main(String[] args) throws Exception {
        final Future<Integer> f1 = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                TimeUnit.SECONDS.sleep(2);
                int temp = 0;
                while (temp++ < 30)
                    System.out.println("F1-" + temp + Thread.currentThread().getName());
                return Integer.valueOf(temp);
            }
        });
        final Future<Integer> f2 = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int temp = 0;
                while (temp++ < 30)
                    System.out.println("F2-" + temp + Thread.currentThread().getName());
                ;
                return Integer.valueOf(temp);
            }
        });
        final Future<Integer> f3 = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int temp = 0;
                while (temp++ < 30)
                    System.out.println("F3-" + temp + Thread.currentThread().getName());
                ;
                return Integer.valueOf(temp);
            }
        });
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println(Thread.currentThread().getName());
                    System.out.println(f1.get() + f2.get() + f3.get());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
            }
        });

        System.out.println("【线程活跃数】" + executorService.getActiveCount());
        System.out.println("【总任务数】" + executorService.getTaskCount());
        System.out.println("【已完成任务数】" + executorService.getCompletedTaskCount());
        TimeUnit.SECONDS.sleep(8);
        System.out.println("【线程活跃数】" + executorService.getActiveCount());
        System.out.println("【总任务数】" + executorService.getTaskCount());
        System.out.println("【已完成任务数】" + executorService.getCompletedTaskCount());

        // 重新计数
        executorService.resetTaskCount();
        final Future<Integer> f4 = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                TimeUnit.SECONDS.sleep(3);
                int temp = 0;
                while (temp++ < 30)
                    System.out.println("F4-" + temp + Thread.currentThread().getName());
                ;
                return Integer.valueOf(temp);
            }
        });
        f4.get();
        System.out.println("【线程活跃数】" + executorService.getActiveCount());
        System.out.println("【总任务数】" + executorService.getTaskCount());
        System.out.println("【已完成任务数】" + executorService.getCompletedTaskCount());
    }

}
