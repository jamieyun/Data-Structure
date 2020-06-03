package list.linkedlist.implementation;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size = 0;

    public void addFirst(Object element) {
        Node newNode = new Node(element);
        newNode.next = head;
        head = newNode;
        size++;
        if (head.next == null) {
            tail = head;
        }
    }

    public void addLast(Object element) {
        Node newNode = new Node(element);
        if (size == 0) {
            addFirst(element);
        } else {
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }

    private class Node {
        private Object data;
        private Node next;

        public Node(Object data) {
            this.data = data;
            this.next = null;
        }

        @Override
        public String toString() {
            return String.valueOf(this.data);
        }
    }
}
