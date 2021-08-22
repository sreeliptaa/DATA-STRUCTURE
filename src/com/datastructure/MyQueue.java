package com.datastructure;

public class MyQueue {
    private final MyLinkedList myLinkedList;

    public MyQueue() {
        this.myLinkedList = new MyLinkedList();
    }

    //method for adding the elements to the Queue
    public void enqueue(INode newNode) {
        myLinkedList.append(newNode);
    }

    //method for display the output
    public void printQueue() {
        myLinkedList.printMyNodes();
    }
}
