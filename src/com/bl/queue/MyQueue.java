package com.bl.queue;

import com.bl.linkedList.INode;
import com.bl.linkedList.MyLinkedList;
import com.bl.linkedList.MyNode;

public class MyQueue {
    private final MyLinkedList myLinkedList;

    public MyQueue() {
        this.myLinkedList = new MyLinkedList();
    }

    public void printQueue() {
        myLinkedList.printMyNodes();
    }

    public INode peak() {
        return myLinkedList.head;
    }

    public void enqueue(INode myNode) {
        myLinkedList.enqueue(myNode);
    }
}
