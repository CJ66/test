package com.emrubik.thread.s10;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class NewThreadPoolExecutor extends ThreadPoolExecutor {
    private long tempCompletedTaskCount;

    private long tempTaskCount;

    public NewThreadPoolExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit,
                                 BlockingQueue<Runnable> workQueue) {
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue);
    }

    public NewThreadPoolExecutor(int nThreads) {
        super(nThreads, nThreads, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>());
    }

    public long getCompletedTaskCount() {
        return super.getCompletedTaskCount() - tempCompletedTaskCount;
    }

    public long getTaskCount() {
        return super.getTaskCount() - tempTaskCount;
    }

    public void resetTaskCount() {
        if (super.getCompletedTaskCount() == super.getTaskCount()) {
            tempCompletedTaskCount = super.getCompletedTaskCount();
            tempTaskCount = super.getTaskCount();
        }
    }

}
