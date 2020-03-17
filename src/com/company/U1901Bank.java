package com.company;

public class U1901Bank {
    int intTo, intFrom = 220;

    public synchronized void calc (int transaction, long lngTimeout) {
        System.out.println ("Current values = " + intTo + " " + intFrom + " " + Thread.currentThread ().getName ());
        intFrom = intFrom - transaction;

        try {
            Thread.sleep (lngTimeout);
        } catch (InterruptedException e) {
            e.printStackTrace ();
        }
        intTo += transaction;
        System.out.println ("New values = " + intTo + " " + intFrom + " " + Thread.currentThread ().getName ());
    }
}
