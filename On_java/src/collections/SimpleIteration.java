package collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SimpleIteration {
    public static void main(String []args){
        List<Integer> lists = new LinkedList(Arrays.asList(1,2,3,4));
        Iterator<Integer> iter = (Iterator<Integer>) lists.iterator();
        while(iter.hasNext()){
            int i = iter.next();

        }
    }
}
