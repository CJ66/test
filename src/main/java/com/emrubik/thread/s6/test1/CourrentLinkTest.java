/*******************************************************************************
 * @(#)CourrentLinkTest.java 2018年8月16日
 *
 * Copyright 2018 emrubik Group Ltd. All rights reserved.
 * EMRubik PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *******************************************************************************/
package com.emrubik.thread.s6.test1;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.locks.ReentrantLock;

/**
 * TODO 这里请补充该类型的简述说明
 * @author <a href="mailto:changj@emrubik.com">chang jiang</a>
 * @version $Revision 1.0 $ 2018年8月16日 下午6:58:49
 */
public class CourrentLinkTest {
    public static void main(String[] args) {
        ConcurrentLinkedQueue<Object> c = new ConcurrentLinkedQueue<Object>();

        // 用数组实现的有界阻塞队列
        ArrayBlockingQueue abq = new ArrayBlockingQueue<>(1);
        
//        LinkedBlockingQueue是一个用链表实现的有界阻塞队列。此队列的默认和最大长度为
//        Integer.MAX_VALUE。此队列按照先进先出的原则对元素进行排序。
        LinkedBlockingQueue lbq = new LinkedBlockingQueue();
        
//        PriorityBlockingQueue是一个支持优先级的无界阻塞队列。默认情况下元素采取自然顺序
//        升序排列。也可以自定义类实现compareTo()方法来指定元素排序规则，或者初始化
//        PriorityBlockingQueue时，指定构造参数Comparator来对元素进行排序。需要注意的是不能保证
//        同优先级元素的顺序。
        PriorityBlockingQueue pbq = new PriorityBlockingQueue();
    }

    ArrayBlockingQueue fairQueue = new ArrayBlockingQueue(1000, true);

//    public ArrayBlockingQueue(int capacity, boolean fair) {
//        if (capacity <= 0)
//        throw new IllegalArgumentException();
//        this.items = new Object[capacity];
//        lock = new ReentrantLock(fair);
//        notEmpty = lock.newCondition();
//        notFull = lock.newCondition();
//        }
}
