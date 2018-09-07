package com.emrubik.thread.s11;

import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {

        LinkedList<Integer> queue = new LinkedList<Integer>();

        MyProducer producer = new MyProducer(queue);

        MyCustomer customer = new MyCustomer(queue);

        ExecutorService executor = Executors.newFixedThreadPool(4);

        executor.submit(customer);

        executor.submit(producer);

        executor.shutdown();

    }
}
