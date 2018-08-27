/*******************************************************************************
 * @(#)CompletionServiceTest.java 2018年8月27日
 *
 * Copyright 2018 emrubik Group Ltd. All rights reserved.
 * EMRubik PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *******************************************************************************/
package com.emrubik.thread.s9;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * TODO 这里请补充该类型的简述说明
 * @author <a href="mailto:changj@emrubik.com">chang jiang</a>
 * @version $Revision 1.0 $ 2018年8月27日 下午5:37:14
 */
public class CompletionServiceTest {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(10);        //创建含10.条线程的线程池
        CompletionService<?> completionService = new ExecutorCompletionService(executor);
        for (int i =1; i <=10; i++) {
            final  int result = i;
            completionService.submit(new Callable() {
                public Object call() throws Exception {
                    Thread.sleep(new Random().nextInt(5000));   //让当前线程随机休眠一段时间
                    return result;
                }
            });
        }
        System.out.println(completionService.take().get());   //获取执行结果
    }
}
