package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer>result=new ArrayDeque<>();
        System.out.println(firstQueue);
        System.out.println(secondQueue);
        result.add(firstQueue.poll());
        result.add(firstQueue.poll());
        result.add(secondQueue.poll());
        result.add(secondQueue.poll());

        while(!firstQueue.isEmpty()&& !secondQueue.isEmpty()){
            if(!firstQueue.isEmpty()) {
                firstQueue.add(result.getLast());
                result.removeLast();
                result.add(firstQueue.poll());
                result.add(firstQueue.poll());
            }
            if(!secondQueue.isEmpty()) {
                secondQueue.add(result.getLast());
                result.removeLast();
                result.add(secondQueue.poll());
                result.add(secondQueue.poll());
            }
        }
        return result;
    }
}
