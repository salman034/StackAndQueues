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

    public void enqueue(INode myNode) {
        myLinkedList.enqueue(myNode);
    }

    public INode dequeue() {
        return myLinkedList.dequeue();
    }
}
