package Multithreading;

public class Stack {
    private int[] array;
    private int stackTop;
    Object lock;

    public Stack(int capacity){
        array = new int[capacity];
        stackTop =-1;
        lock = new Object();
    }


    public boolean isStackEmpty(){
        return stackTop <0;
    }

    public boolean isStackFull(){
        return stackTop>=(array.length-1);
    }

    public synchronized boolean push(int element){
        if(isStackFull()) 
            return false;
        ++ stackTop;    
        try {Thread.sleep(1000);} catch (Exception e) {}
        array[stackTop] = element;
        return true;
    }

    public synchronized int pop(){
        if(isStackEmpty())
            return Integer.MIN_VALUE;
        int obj =array[stackTop]; 
        array[stackTop] = Integer.MIN_VALUE;
        try {Thread.sleep(1000);} catch (Exception e) {}
        stackTop--;
        return obj;
    }



}
