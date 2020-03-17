package com.company;

public class U1901Thread extends Thread{

    U1901Thread (U1901Bank bank, int trans, long sleep){
        this.bankword = bank;
        this.intTrans = trans;
        this.lngSleep = sleep;
    }

    public U1901Bank getBankword (){
        return bankword;
    }

    public int getIntTrans (){
        return intTrans;
    }

    public long getLngSleep (){
        return lngSleep;
    }

    private U1901Bank bankword;
    private int intTrans;
    private long lngSleep;

    public void run (){
        bankword.calc (intTrans, lngSleep);
    }

}
