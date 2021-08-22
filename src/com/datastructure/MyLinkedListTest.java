package com.datastructure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/** Purpose - insert 40 after 30  and then remove 40 from linked list
 * Final sequence will be 56->30->70
 * @author - Sreelipta
 */

public class MyLinkedListTest {
    @Test
    void given3NumbersWhenInsertedAndDeletedFourthNumberShouldPassLinkedListResult() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.printMyNodes();
        myLinkedList.searchMyNode();
        myLinkedList.insert(40, 2);
        myLinkedList.printMyNodes();
        myLinkedList.remove(2);
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(myFirstNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(myThirdNode);
        System.out.println(result);
        Assertions.assertTrue(result);
    }
}