package com.bl.queue;

import org.junit.Test;
import com.bl.linkedList.INode;
import com.bl.linkedList.MyNode;
import junit.framework.Assert;

public class MyQueueTest {
    @Test
    public void given3NumberWhenDequeueToQueueshouldHaveBeginningNode() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyQueue myQueue = new MyQueue();
        myQueue.enqueue(myFirstNode);
        myQueue.enqueue(mySecondNode);
        myQueue.enqueue(myThirdNode);
        INode dequeue = myQueue.dequeue();
        myQueue.printQueue();
        Assert.assertEquals(myFirstNode, dequeue);
    }
}
