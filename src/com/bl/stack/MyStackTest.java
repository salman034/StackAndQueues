package com.bl.stack;

import org.junit.Test;
import com.bl.linkedList.INode;
import com.bl.linkedList.MyNode;
import junit.framework.Assert;

public class MyStackTest {
    @Test
    public void given3NumberWhenAddedToStackshouldHavaLastAddedNode() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyStack myStack= new MyStack();
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        myStack.printStack();
        INode peak = myStack.peak();
        Assert.assertEquals(myThirdNode, peak);
    }
}
