package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class BerylliumSphere{
    private static long counter;
    private final long id = counter++;
    public String toString(){
        return "Sphere"+id;
    }
}
public class CollectionComparison {
    public static void main(String[]args){
        BerylliumSphere[] spheres = new BerylliumSphere[10];
        for(int i = 0;i<5;i++)
            spheres[i] = new BerylliumSphere();
        for(int i = 0;i<5;i++)
            System.out.println(spheres[i]);

        List<Integer> intList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        intList.add(97);
        System.out.println(intList);
        System.out.println(intList.get(4));
    }
}
