

import Multithreading.Stack;

public class SynchronousChecker {
    public static void main(String[] args) {

        System.out.println("Main is Starting");

        Stack stack = new Stack(5);
        new Thread(()->{
            int counter =0;
            while(++ counter <5)
            System.out.println("Pushed :"+stack.push(counter));
        },"Pusher").start();


        new Thread(()->{
            int counter =0;
            while(++counter<5)
                System.out.println("Popped :"+stack.pop());
        },"Popped").start();


        System.out.println("Main is Exiting");
    }
}
