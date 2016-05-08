package com.jrd.second_chapter;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by jakub on 08.05.16.
 */
public class QueueTest {
    private Queue queue;

    @Before
    public void setup() {
        queue = new Queue();
        queue.enqueue("pierwszy");
        queue.enqueue("drugi");
        queue.enqueue("trzeci");
    }

    @Test
    public void testPrintQueue() {
        //queue.enqueue("czwarty");
        System.out.println(queue.printQueue());
        Assert.assertTrue(queue.getSize() == 3);
    }

    @Test
    public void testDequeue() throws Exception {
        String pierszy = queue.dequeue();
        String drugi = queue.dequeue();
        long rozmiar = queue.getSize();
        Assert.assertTrue("pierwszy".equals(pierszy));
        Assert.assertTrue("drugi".equals(drugi));
        Assert.assertTrue(rozmiar == 1);
    }

    @Test(expected = Exception.class)
    public void shouldRaiseExceptionWhenQueueEmpty() throws Exception {
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
    }
}
