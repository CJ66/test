package com.emrubik.thread.s7;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;

public class Test1 {
    static AtomicInteger ai = new AtomicInteger(1);
    static AtomicBoolean ab = new AtomicBoolean(true);
    static AtomicLong al = new AtomicLong(1);
    public static void main(String[] args) {
        AtomicIntegerArrayTest();
    }


    public static void AtomicIntegerTest() {
        System.out.println(ai.getAndIncrement());
        System.out.println(ai.get());
    }


    static AtomicIntegerArray aiA = new AtomicIntegerArray(5);

    public static  void AtomicIntegerArrayTest (){
        System.out.println(aiA.addAndGet(2,5));
        System.out.println(aiA.get(1));
        System.out.println(aiA.compareAndSet(1,0,9));
        System.out.println(aiA.get(1));
        System.out.println(aiA.getAndSet(0,3));
        System.out.println(aiA.get(0));
        System.out.println(aiA.length());

    }
}
