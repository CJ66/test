/*******************************************************************************
 * @(#)ThreadPoolTest.java 2018年8月27日
 *
 * Copyright 2018 emrubik Group Ltd. All rights reserved.
 * EMRubik PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *******************************************************************************/
package com.emrubik.thread.s9;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * TODO 这里请补充该类型的简述说明
 * @author <a href="mailto:changj@emrubik.com">chang jiang</a>
 * @version $Revision 1.0 $ 2018年8月27日 下午5:11:44
 */
public class ThreadPoolTest {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService threadPool = Executors.newCachedThreadPool();//线程池里面的线程数会动态变化，并可在线程线被移除前重用
           for (int i = 1; i <= 3; i ++) {
               final  int task = i;   //10个任务
               //TimeUnit.SECONDS.sleep(1);
               threadPool.execute(new Runnable() {    //接受一个Runnable实例
                   public void run() {
                           System.out.println("线程名字： " + Thread.currentThread().getName() +  "  任务名为： "+task);
                   }
               });
           }
       }
}
