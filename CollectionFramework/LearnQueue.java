package TotalJava.CollectionFramework;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {
    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(19);// add element to queue
        System.out.println(queue);
        queue.offer(20);// also used to add element to the queue
        System.out.println(queue);
        System.out.println(queue.size());
        queue.poll();// used to remove element from the queue in FIFO order
        System.out.println(queue.size());//used to check the size of queue
        System.out.println(queue);
        System.out.println(queue.peek());// used to see which element is at first position
        System.out.println(queue.element());// also used to see which element is at first position but if the queue is empty it will throw the exception
    }
}
