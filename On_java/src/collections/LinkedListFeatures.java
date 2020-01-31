package collections;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListFeatures {
    public static void main(String []args){
        LinkedList<Integer> lists = new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println(lists);
        System.out.println(lists.getFirst());
        System.out.println(lists.element());
        System.out.println(lists.peek());
        System.out.println(lists.remove());
        System.out.println(lists.removeFirst());
        System.out.println(lists.poll());
    }

}
