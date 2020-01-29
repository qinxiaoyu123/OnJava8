package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteration {
    public static void main(String[] args) {
        List<Integer> lists = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        ListIterator<Integer> it = lists.listIterator();
        while (it.hasNext()) {
            System.out.println(it.next() + " " + it.nextIndex() + " " + it.previousIndex());
        }
        System.out.println();
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }
        it = lists.listIterator(3);
        while (it.hasNext()) {
            ;
            System.out.println(it.next() + " " + it.nextIndex() + " " + it.previousIndex());
        }
    }
}
