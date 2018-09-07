package com.emrubik.thread.s11;

import java.util.LinkedList;

public class MyCustomer implements Runnable{

    private LinkedList<Integer> queue;

    public MyCustomer(LinkedList<Integer> queue) {
        super();
        this.queue = queue;
    }

    @Override
    public void run() {
        for(int i =0 ;i<10;i++){
            synchronized (queue) {
                while(queue.isEmpty()){
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("customer..."+i);
                queue.remove();
                queue.notifyAll();
            }
        }
    }

}
