package list.linkedlist.implementation;

public class Main {
    public static void main(String[] args) {
        LinkedList numbers = new LinkedList();
        numbers.addLast(10);
        numbers.addLast(20);
        numbers.addLast(30);
        numbers.addLast(40);
//        System.out.println(numbers.remove(1));
//        System.out.println(numbers.removeLast());
//        System.out.println(numbers.removeFirst());
//        System.out.println("numbers = " + numbers.size());
//        System.out.println("numbers = " + numbers.get(2));
//        System.out.println("numbers.indexOf(10) = " + numbers.indexOf(40));

        LinkedList.ListIterator it = numbers.listIterator();
        it.add(5);
        System.out.println(it.next());
        it.add(15);
        System.out.println("numbers = " + numbers);
        /*while (it.hasNext()) {
            System.out.println(it.next());
        }*/
//        it.hasNext();
    }
}
