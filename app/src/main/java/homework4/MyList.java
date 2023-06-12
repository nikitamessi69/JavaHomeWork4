package homework4;
//Пусть дан LinkedList с несколькими элементами. 
//Реализуйте метод, который вернет “перевернутый” список.

import java.util.LinkedList;
import java.util.Collections;

public class MyList {
   public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> list) {
        Collections.reverse(list);
        return list;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println("Original list: " + list);

        LinkedList<Integer> reversedList = reverseLinkedList(list);

        System.out.println("Reversed list: " + reversedList);
    }
}
// Или используем метод без Collections.reverse:

// public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> list) {
//    LinkedList<Integer> reversedList = new LinkedList<>();
//    for (int i = list.size() - 1; i >= 0; i--) {
//        reversedList.add(list.get(i));
//    }
//   return reversedList;
// }