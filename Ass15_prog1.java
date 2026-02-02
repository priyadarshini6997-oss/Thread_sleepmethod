package com.index;
public class Ass15_prog1 {

    public static void main(String[] args) {

        System.out.println("Main thread started");

        try {
            // Pause for 3 seconds (3000 milliseconds)
            Thread.sleep(3000);
        } 
        catch (InterruptedException e) {
            System.out.println("Main thread was interrupted");
        }

        System.out.println("Main thread resumed after 3 seconds");
    }
}
