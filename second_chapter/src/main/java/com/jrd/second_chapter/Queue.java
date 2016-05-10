package com.jrd.second_chapter;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by jakub on 08.05.16.
 *
 * Rozwiązanie zadania 16
 * Implementacji neograniczonej kolejki ciągów znaków
 *
 * Rozwiązanie zadania 17
 * Implemetnacja iterator tej kolejki
 */
public class Queue implements Iterable<Queue.Node> {

    public static class Node {
        private String value;
        private Node nextNode;

        public Node(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public Node getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node nextNode) {
            this.nextNode = nextNode;
        }
    }

    private class QueueIterator implements Iterator<Node> {
        private Node currentNode;

        public void setCurrentNode(Node currentNode) {
            this.currentNode = currentNode;
        }

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }

        @Override
        public Node next() {
            if (currentNode != null) {
                Node node = currentNode;
                currentNode = currentNode.getNextNode();
                return node;
            } else {
                throw new NoSuchElementException();
            }
        }
    }

    private Node firstNode;

    private Node lastNode;

    private QueueIterator iterator = new QueueIterator();

    private long size;

    public long getSize() {
        return size;
    }

    @Override
    public Iterator<Node> iterator() {
        return this.iterator;
    }

    public void enqueue(String value) {
        if (firstNode == null) {
            firstNode = new Node(value);
            lastNode = firstNode;
            iterator.setCurrentNode(firstNode);
        } else {
            Node newNode = new Node(value);
            lastNode.setNextNode(newNode);
            lastNode = newNode;
        }

        size++;
    }

    public String dequeue() throws Exception {
        String value = null;
        if (firstNode != null) {
            value = firstNode.getValue();
            firstNode = firstNode.getNextNode();
            size--;
        } else  {
            throw new Exception("Kolejka jest pusta!!!");
        }

        return value;
    }

    public String printQueue() {
        Node currentNode = firstNode;
        String result = "";
        while (currentNode != null) {
            result += currentNode.getValue() + ", ";
            currentNode = currentNode.getNextNode();
        }

        return result;
    }
}
