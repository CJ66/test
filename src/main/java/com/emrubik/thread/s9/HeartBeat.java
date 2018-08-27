/*******************************************************************************
 * @(#)HeartBeat.java 2018年8月27日
 *
 * Copyright 2018 emrubik Group Ltd. All rights reserved.
 * EMRubik PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *******************************************************************************/
package com.emrubik.thread.s9;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * TODO 这里请补充该类型的简述说明
 * @author <a href="mailto:changj@emrubik.com">chang jiang</a>
 * @version $Revision 1.0 $ 2018年8月27日 下午5:08:54
 */
public class HeartBeat {
    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(5);
        Runnable task = new Runnable() {
            public void run() {
                System.out.println("HeartBeat.........................");
            }
        };
        executor.scheduleAtFixedRate(task,5,3, TimeUnit.SECONDS);   //5秒后第一次执行，之后每隔3秒执行一次
    }
}
