package com.jrd.second_chapter;

/**
 * Created by jakub on 08.05.16.
 *
 * Rozwiązanie zadania 16
 * Implementacji neograniczonejkolejki ciągów znaków
 */
public class Queue {
    private static class Node {
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

    private Node firstNode;

    private Node lastNode;

    private long size;

    public long getSize() {
        return size;
    }

    public void enqueue(String value) {
        if (firstNode == null) {
            firstNode = new Node(value);
            lastNode = firstNode;
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
