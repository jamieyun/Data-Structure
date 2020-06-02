package list.arraylist.implementation;


import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        list.arraylist.implementation.ArrayList numbers = new list.arraylist.implementation.ArrayList();

        numbers.addLast(10);
        numbers.addLast(20);
        numbers.addLast(30);
        numbers.addLast(40);

//        numbers.add(1, 15);
//        numbers.addFirst(5);
//        Object remove = numbers.remove(1);
//        System.out.println("remove = " + remove);
//        numbers.removeFirst();
//        numbers.removeLast();
//        System.out.println("numbers.get(0) = " + numbers.get(0));
//        System.out.println(numbers.size());
//        System.out.println("numbers = " + numbers);

//        System.out.println(numbers.indexOf(50));

        ArrayList.ListIterator li = numbers.listIterator();

        /*while (li.hasNext()) {
            System.out.println(li.next());
        }*/
/*
        while (li.hasPrevious()){
            System.out.println(li.previous());
        }*/

        while (li.hasNext()) {
            int number = (int) li.next();
            if (number == 30) {
                li.remove();
            }

        }
        System.out.println(numbers);

    }

}
