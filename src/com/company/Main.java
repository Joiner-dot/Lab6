package com.company;

public class Main {

    public static void main (String[] args) {

        System.out.println (Thread.currentThread ().getName ());
        Object sync = new Object ();
        U1901Bank bank = new U1901Bank ();
        U1901Thread thread = new U1901Thread (bank, 100, 2000);
        thread.setName ("First");
        thread.setPriority (Thread.MAX_PRIORITY);
        thread.start ();
        U1901Thread thread2 = new U1901Thread (bank, 50, 300);
        thread2.setName ("Second");
        thread2.setPriority (Thread.MAX_PRIORITY);
        thread2.start ();
    }
}
