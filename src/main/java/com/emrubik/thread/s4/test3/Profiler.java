/*******************************************************************************
 * @(#)Profiler.java 2018年8月3日
 *
 * Copyright 2018 emrubik Group Ltd. All rights reserved.
 * EMRubik PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *******************************************************************************/
package com.emrubik.thread.s4.test3;

import java.util.concurrent.TimeUnit;

/**
 * TODO 这里请补充该类型的简述说明
 * @author <a href="mailto:changj@emrubik.com">chang jiang</a>
 * @version $Revision 1.0 $ 2018年8月3日 下午3:17:48
 */
public class Profiler {
    // 第一次get()方法调用时会进行初始化（如果set方法没有调用），每个线程会调用一次
    private static final ThreadLocal<Long> TIME_THREADLOCAL = new ThreadLocal<Long>() {
        protected Long initialValue() {
            return System.currentTimeMillis();
        }
    };

    public static final void begin() {
        TIME_THREADLOCAL.set(System.currentTimeMillis());
    }

    public static final long end() {
        return System.currentTimeMillis() - TIME_THREADLOCAL.get();
    }

    public static void main(String[] args) throws Exception {
        Profiler.begin();
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Cost: " + Profiler.end() + " mills");
    }
}
