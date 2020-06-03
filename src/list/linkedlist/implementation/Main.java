package list.linkedlist.implementation;

public class Main {
    public static void main(String[] args) {
        LinkedList numbers = new LinkedList();
        numbers.addLast(10);
        numbers.addLast(20);
        numbers.addLast(30);
        numbers.add(1,15);
        numbers.add(3,25);
        numbers.add(4,27);
        System.out.println("numbers = " + numbers);
    }
}
