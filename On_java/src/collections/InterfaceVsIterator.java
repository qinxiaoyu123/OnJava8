package collections;

import java.util.*;

public class InterfaceVsIterator {
    public static void display(Iterator<Integer> it){
        while(it.hasNext()){
            Integer t = it.next();
            System.out.print(t+" ");
        }
        System.out.println();
    }
    public static void main(String []args){
        List<Integer> intList = new LinkedList<>(Arrays.asList(1,2,3,4,5,6));
        Set<Integer> intSet = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        Map<String, Integer> intMap = new LinkedHashMap<>();
        String[] names = ("Ralph, Eric, Robin, Lacey, " +
                "Britney, Sam, Spot, Fluffy").split(", ");
        for(int i = 0; i < names.length; i++)
            intMap.put(names[i], i+1);
        display(intList.iterator());
        display(intSet.iterator());
        display(intMap.values().iterator());
    }
}
