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

    private Node node(int index) {
        Node x = head;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    public void add(int index, Object element) {
        if (index == 0) {
            addFirst(index);
        } else {
            Node newNode = new Node(element);
            Node node = node(index - 1);
            newNode.next = node.next;
            node.next = newNode;
            size++;
            if (newNode.next == null) {
                tail = newNode;
            }
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

    @Override
    public String toString() {
        if (head == null) {
            return "[]";
        } else {

            Node temp = head;

            String str = "[";

            while (temp.next != null) {
                str += temp.data + ", ";
                temp = temp.next;
            }
            str += temp.data;

            return str + "]";
        }

    }
}
