package org.kodluyoruz;

public class Main {

    public static void main(String[] args) {

        BlockingQueue<Integer> myQueue = new BlockingQueue<Integer>();

        myQueue.add(1);
        myQueue.add(6);


        System.out.println(myQueue.peek());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.poll());


    }
}
