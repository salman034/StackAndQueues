package com.bl.stack;

import com.bl.linkedList.INode;
import com.bl.linkedList.MyLinkedList;
import com.bl.linkedList.MyNode;

public class MyStack {
    private final MyLinkedList myLinkedList;

    public MyStack() {
        this.myLinkedList = new MyLinkedList();
    }

    public void push(INode myNode) {
        myLinkedList.add(myNode);
    }

    public void printStack() {
        myLinkedList.printMyNodes();
    }

    public INode peak() {
        return myLinkedList.head;
    }
}
