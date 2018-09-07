package com.emrubik.thread.s11;

import java.util.LinkedList;

public class MyProducer implements Runnable{

    private LinkedList<Integer> queue;

    public MyProducer(LinkedList<Integer> queue) {
        super();
        this.queue = queue;
    }

    @Override
    public void run() {
        for(int i =0 ;i<10;i++){
            synchronized (queue) {
                while(!queue.isEmpty()){
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("producer..."+i);
                queue.add(i);
                queue.notifyAll();
            }
        }
    }
}

