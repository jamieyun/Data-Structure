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
            addFirst(element);
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

    public Object removeFirst() {
        Node temp = head;
        head = head.next;
        Object returnData = temp.data;
        temp = null;
        size--;
        return returnData;
    }

    public Object remove(int index) {
        if (index == 0) {
            return removeFirst();
        } else {
            Node temp = node(index - 1);
            Node todoDeleted = temp.next;
            temp.next = temp.next.next;
            Object returnData = todoDeleted.data;
            if (todoDeleted == tail) {
                tail = temp;
            }
            todoDeleted = null;
            size--;
            return returnData;
        }
    }

    public Object removeLast() {
        return remove(size - 1);
    }

    public int size() {
        return size;
    }

    public Object get(int index) {
        Node temp = node(index);
        return temp.data;
    }

    public int indexOf(Object element) {
        Node temp = head;
        int index = 0;
        while (temp.data != element) {
            temp = temp.next;
            index++;
            if (temp == null) {
                return -1;
            }
        }
        return index;
    }

    public ListIterator listIterator() {
        return new ListIterator();
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

    public class ListIterator {

        private Node next;
        private Node lastReturned;
        private int nextIndex;

        public ListIterator() {
            next = head;
        }

        public Object next() {
            lastReturned = next;
            next = next.next;
            nextIndex++;
            return lastReturned;
        }

        public boolean hasNext() {
            return nextIndex < size();
        }

        public void add(Object element) {
//            LinkedList.this.add(nextIndex++, element);
            /* add(5) first
            Node newNode = new Node(element);
            head = newNode;
            newNode.next = next;

            lastReturned = newNode;
            nextIndex++;
            size++;*/

            Node newNode = new Node(element);
            if(lastReturned == null) {
                head = newNode;
                newNode.next = next;
            }else {
                lastReturned.next = newNode;
                newNode.next = next;
            }
            lastReturned = newNode;
            nextIndex++;
            size++;
        }
    }
}
