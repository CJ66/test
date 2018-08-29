package com.emrubik.thread.s7;

import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

public class AtomicReferenceTest {
    

    static AtomicMarkableReference<String> atomicMarkableReference = new AtomicMarkableReference<String>("state",false);
    
    public static AtomicReference<User> atomicUserRef = new AtomicReference<User>();
    public static void main(String[] args) {
        User user = new User("conan", 15);
        atomicUserRef.set(user);
        User updateUser = new User("Shinichi", 17);
        atomicUserRef.compareAndSet(user, updateUser);
        System.out.println(atomicUserRef.get().getName());
        System.out.println(atomicUserRef.get().getOld());
        System.out.println("=========================");
    }

    static class User {
        private String name;
        private int old;
        private School school;
        private boolean state;

        public boolean isState() {
            return state;
        }

        public void setState(boolean state) {
            this.state = state;
        }

        public User(String name, int old) {
            this.name = name;
            this.old = old;
        }

        public User(String name, int old, boolean state) {
            this.name = name;
            this.state = state;
            this.old = old;
        }

        public String getName() {
            return name;
        }

        public int getOld() {
            return old;
        }

        public School getSchool() {
            return school;
        }

        public void setSchool(School school) {
            this.school = school;
        }
    }

    static class School {
        private String name;
        private String address;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }
}
