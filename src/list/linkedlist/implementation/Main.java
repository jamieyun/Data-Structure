package list.linkedlist.implementation;

public class Main {
    public static void main(String[] args) {
        LinkedList numbers = new LinkedList();
        numbers.addLast(5);
        numbers.addLast(10);
        numbers.addLast(15);
        numbers.addLast(20);
        numbers.addLast(30);
        numbers.add(5,40);
//        System.out.println(numbers.remove(1));
        System.out.println(numbers.removeLast());
//        System.out.println(numbers.removeFirst());
        System.out.println("numbers = " + numbers.size());
        System.out.println("numbers = " + numbers.get(2));
    }
}
