package collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PetMap {
    public static final Map<Integer, List<Integer>> mapList = new HashMap<>();
    public static void main(String []args){
        mapList.put(1, Arrays.asList(1,2,3,4,5));
        mapList.put(6, Arrays.asList(6,7,8,9,10));

        System.out.println(mapList.keySet());
        for(Integer a :mapList.keySet()){
            System.out.println(mapList.get(a));
        }


    }
}
