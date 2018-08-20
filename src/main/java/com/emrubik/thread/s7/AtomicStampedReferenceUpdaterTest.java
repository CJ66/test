package com.emrubik.thread.s7;

import java.util.concurrent.atomic.AtomicStampedReference;

public class AtomicStampedReferenceUpdaterTest {
    // 创建原子更新器，并设置需要更新的对象类和对象的属性
//    private final static AtomicStampedReference<User> a = new AtomicStampedReference<User>(User.class,0);


    public static void main(String[] args) {

        User conan = new User("conan", 10);
        AtomicStampedReference<User> a = new AtomicStampedReference<User>(conan,0);
        User conan2 = new User("conan2", 12);


        System.out.println(a.getReference().getName() + a.getReference().old);
    }

    public static class User {
        private String name;
        public volatile int old;

        public User(String name, int old) {
            this.name = name;
            this.old = old;
        }

        public String getName() {
            return name;
        }

        public int getOld() {
            return old;
        }
    }
}
