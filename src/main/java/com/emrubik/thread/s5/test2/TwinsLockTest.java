/*******************************************************************************
 * @(#)TwinsLockTest.java 2018年8月9日
 *
 * Copyright 2018 emrubik Group Ltd. All rights reserved.
 * EMRubik PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *******************************************************************************/
package com.emrubik.thread.s5.test2;

import java.util.concurrent.locks.Lock;

import org.junit.Test;

import com.emrubik.thread.s4.test2.SleepUtils;

/**
 * TODO 这里请补充该类型的简述说明
 * @author <a href="mailto:changj@emrubik.com">chang jiang</a>
 * @version $Revision 1.0 $ 2018年8月9日 下午6:34:18
 */
public class TwinsLockTest {
    @Test
    public void test() {
        final Lock lock = new Mutex();
        class Worker extends Thread {
            public void run() {
                while (true) {
                    lock.lock();
                    try {
                        SleepUtils.second(1);
                        System.out.println(Thread.currentThread().getName());
                        SleepUtils.second(1);
                    } finally {
                        lock.unlock();
                    }
                }
            }
        }
        // 启动10个线程
        for (int i = 0; i < 10; i++) {
            Worker w = new Worker();
            w.setDaemon(true);
            w.start();
        }
        // 每隔1秒换行
        for (int i = 0; i < 20; i++) {
            SleepUtils.second(1);
            System.out.println();
        }
    }
}
