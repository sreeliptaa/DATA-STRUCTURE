package com.datastructure;

import org.junit.Test;

/**
 * purpose - To create a Queue using enqueue method
 * Final Sequence will be 56->30->70
 * @author - Sreelipta
 */

public class MyQueueTest {
    @Test
    public void given3NumbersWhenAppendToQueueShouldHaveLastAddedToNode() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyQueue myQueue = new MyQueue();
        myQueue.enqueue(myFirstNode);
        myQueue.enqueue(mySecondNode);
        myQueue.enqueue(myThirdNode);
        myQueue.printQueue();
    }
}
