/*******************************************************************************
 * @(#)TwinsLock.java 2018年8月9日
 *
 * Copyright 2018 emrubik Group Ltd. All rights reserved.
 * EMRubik PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *******************************************************************************/
package com.emrubik.thread.s5.test2;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * TODO 这里请补充该类型的简述说明
 * @author <a href="mailto:changj@emrubik.com">chang jiang</a>
 * @version $Revision 1.0 $ 2018年8月9日 下午6:31:08
 */
public class TwinsLock1 implements Lock {
    private final Sync sync = new Sync(2);

    private static final class Sync extends AbstractQueuedSynchronizer {
        Sync(int count) {
            if (count <= 0) {
                throw new IllegalArgumentException("count must large than zero.");
            }
            setState(count);
        }

        public int tryAcquireShared(int reduceCount) {
            for (;;) {
                int current = getState();
                int newCount = current - reduceCount;
                if (newCount < 0 || compareAndSetState(current, newCount)) {
                    return newCount;
                }
            }
        }

        public boolean tryReleaseShared(int returnCount) {
            for (;;) {
                int current = getState();
                int newCount = current + returnCount;
                if (compareAndSetState(current, newCount)) {
                    return true;
                }
            }
        }
    }

    public void lock() {
        sync.acquireShared(1);
    }

    public void unlock() {
        sync.releaseShared(1);
    }
    // 其他接口方法略

    /**
     * lockInterruptibly TODO 这里请补充overriding方法的简要说明
     * @throws InterruptedException TODO 请在每个@param,@return,@throws行尾补充对应的简要说明
     * @see java.util.concurrent.locks.Lock#lockInterruptibly()
     */
    @Override
    public void lockInterruptibly() throws InterruptedException {
        // TODO Auto-generated method stub

    }

    /**
     * tryLock TODO 这里请补充overriding方法的简要说明
     * @return TODO 请在每个@param,@return,@throws行尾补充对应的简要说明
     * @see java.util.concurrent.locks.Lock#tryLock()
     */
    @Override
    public boolean tryLock() {
        // TODO Auto-generated method stub
        return false;
    }

    /**
     * tryLock TODO 这里请补充overriding方法的简要说明
     * @param time
     * @param unit
     * @return
     * @throws InterruptedException TODO 请在每个@param,@return,@throws行尾补充对应的简要说明
     * @see java.util.concurrent.locks.Lock#tryLock(long, java.util.concurrent.TimeUnit)
     */
    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        // TODO Auto-generated method stub
        return false;
    }

    /**
     * newCondition TODO 这里请补充overriding方法的简要说明
     * @return TODO 请在每个@param,@return,@throws行尾补充对应的简要说明
     * @see java.util.concurrent.locks.Lock#newCondition()
     */
    @Override
    public Condition newCondition() {
        // TODO Auto-generated method stub
        return null;
    }
}
