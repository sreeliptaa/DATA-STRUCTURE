package com.datastructure;

// method for create linked list
public class MyLinkedList {
    public INode head;
    public INode tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    //method for add elements in linked list
    public void add(INode newNode) {
        if (this.tail == null) {
            this.tail = newNode;
        }
        if (this.head == null) {
            this.head = newNode;
        } else {
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }

    //method for append elements to linked list
    public void append(INode myNode) {
        if (this.head == null) {
            this.head = myNode;
        }
        if (this.tail == null) {
            this.tail = myNode;
        } else {
            this.tail.setNext(myNode);
            this.tail = myNode;
        }
    }

    // method for insert the element in between two nodes
    public void insert(INode myNode, INode newNode) {
        INode tempNode = myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
    }

    // method for delete the first node
    public INode pop() {
        INode tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }

    // method for delete the last node
    public void popLast() {
        INode tempNode = head;
        while (!tempNode.getNext().equals(tail)) {
            tempNode = tempNode.getNext();
        }
        this.tail=tempNode;
        tempNode.setNext(null);
    }

    // method for searching position of a node element in the list
    public void searchMyNode() {
        INode tempNode = head;
        int position = 0;
        while (tempNode != null) {
            position++;
            if (tempNode.getKey().equals(30)) {
                System.out.println("Your Node With Key value 30 is present at " +position+ " in the list");
            }
            tempNode = tempNode.getNext();
        }
    }

    // method for inserting a new key value
    public void insert(int key, int position) {
        MyNode newNode = new MyNode(key);
        MyNode nodeAtPreviousIndex = (MyNode) head;
        for (int i = 0; i < position - 1; i++) {
            nodeAtPreviousIndex = (MyNode) nodeAtPreviousIndex.next;
        }
        newNode.next = nodeAtPreviousIndex.next;
        nodeAtPreviousIndex.next = newNode;
        System.out.println("After inserting a new node with key value " + key + " at position " + position + " : ");
    }

    // method for removing a key from linked list
    public void remove(int position) {
        MyNode tempNode = (MyNode) head;
        MyNode currentNode = (MyNode) head;
        for (int i = 0; i < position; i++) {
            tempNode = currentNode;
            currentNode = (MyNode) currentNode.next;
        }
        tempNode.next = currentNode.next;
    }


    //method for displaying output
    public void printMyNodes() {
        StringBuilder myNodes = new StringBuilder("My Nodes : ");
        INode tempNode = head;
        while (tempNode.getNext() != null) {
            myNodes.append(tempNode.getKey());
            if (!tempNode.equals(tail)) myNodes.append("->");
            tempNode = tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }

}