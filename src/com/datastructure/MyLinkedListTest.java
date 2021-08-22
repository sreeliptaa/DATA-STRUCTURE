package com.datastructure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/** Purpose - search LinkedList to find Node with value 30
 * @author - Sreelipta
 */

public class MyLinkedListTest {
    @Test
    void givenElementWhenSearchedShouldPassLinkedListResult() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.printMyNodes();
        myLinkedList.searchMyNode();
        boolean result = myLinkedList.head.equals(myFirstNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(myThirdNode);
        System.out.println(result);
        Assertions.assertTrue(result);
    }
}