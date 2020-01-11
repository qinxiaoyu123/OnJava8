// reuse/FinalData.java
// The effect of final on fields

import javax.swing.*;
import java.util.*;

//class Value {
//    int i; // package access
//
//    Value(int i) {
//        this.i = i;
//    }
//}
class Value {
    int i;

    Value(int i) {
        this.i = i;
    }

//    @Override
//    public String toString() {
//        return i + " ";
//    }
}

public class FinalData {
    private String id;
    private int i;
    private final int finalJ = 2;
    private static int x = 2;
    private static final int sFinalJ = 2;
//    private final static int fStaticJ = 2;
    private final int[] a = {1, 2, 3};
    private int[] b = new int[3];
    private final Value[]  value= new Value[]{new Value(1), new Value(2), new Value(3)};
    private static final Value VAL_3 = new Value(33);
    FinalData(int i) {
        this.i = i;
    }

    FinalData(String id) {
        this.id = id;
    }

    FinalData(int i, String id) {
        this(i);
        this.id = id;
    }

    @Override
    public String toString() {
        return id + " " + x + " " + a[0] + " " + a[1] + " " + a[2]+ " "+ value[1]+ Arrays.toString(b);
    }

    public static void main(String[] args) {
        FinalData finalData1 = new FinalData("qinxiaoyu");
//        can not change the value of jj
//        finalData1.jj = 2;
        System.out.println(finalData1);
        System.out.println(finalData1.a);
        System.out.println(Arrays.toString(finalData1.a));

        final String line = "aaa";
        String line1 = "bbb";
        changeVaule(line);
        changeVaule(line1);
        System.out.println(line);
        System.out.println(line1);

        System.out.println(Arrays.toString(finalData1.value));
        finalData1.value[0] = changeObject(finalData1.value[0]);
        System.out.println("qxy change"+Arrays.toString(finalData1.value));
        Value changeValue = new Value(1);
        System.out.println("change >"+changeValue);
        changeObject(changeValue);
        System.out.println("after change >"+changeValue);
        System.out.println(finalData1.value);
        System.out.println(Arrays.toString(finalData1.value));

        finalData1.value[1].i++;
        System.out.println(finalData1.value);
        System.out.println(Arrays.toString(finalData1.value));

        finalData1.value[1] = new Value(5);
        System.out.println(finalData1.value);
        System.out.println(Arrays.toString(finalData1.value));

        finalData1.x = 3;
//        can not change the value of sFinalJ
//        finalData1.sFinalJ = 3;
        finalData1.a[2] = 4;

//        can not change reference
//        finalData1.value = new Value[]{new Value(3)};



//        can change the object value of this reference
        finalData1.VAL_3.i++;
//        can not change reference
//        finalData1.VAL_3 = new Value(9);
//        FinalData finalData2 = new FinalData("qinxiaoyu");
//        System.out.println(finalData1);

    }

    private static Value changeObject(Value value) {
        value = new Value(9);
        System.out.println("inner change > "+value);
        return value;
    }

    private static void changeVaule(String line) {
        line = "cccc";
    }

}

//public class FinalData {
//    private static Random rand = new Random(47);
//    private String id;
//
//    public FinalData(String id) {
//        this.id = id;
//    }
//    // Can be compile-time constants:
//    private final int valueOne = 9;
//    private static final int VALUE_TWO = 99;
//    // Typical public constant:
//    public static final int VALUE_THREE = 39;
//    // Cannot be compile-time constants:
//    private final int i4 = rand.nextInt(20);
//    static final int INT_5 = rand.nextInt(20);
//    private Value v1 = new Value(11);
//    private final Value v2 = new Value(22);
//    private static final Value VAL_3 = new Value(33);
//    // Arrays:
//    private final int[] a = {1, 2, 3, 4, 5, 6};
//
//    @Override
//    public String toString() {
//        return id + ": " + "i4 = " + i4 + ", INT_5 = " + INT_5;
//    }
//
//    public static void main(String[] args) {
//        FinalData fd1 = new FinalData("fd1");
//        //- fd1.valueOne++; // Error: can't change value
//        fd1.v2.i++; // Object isn't constant
//        fd1.v1 = new Value(9); // OK -- not final
//        for (int i = 0; i < fd1.a.length; i++) {
//            fd1.a[i]++; // Object isn't constant
//        }
//        //- fd1.v2 = new Value(0); // Error: Can't
//        //- fd1.VAL_3 = new Value(1); // change reference
//        //- fd1.a = new int[3];
//        System.out.println(fd1);
//        System.out.println("Creating new FinalData");
//        FinalData fd2 = new FinalData("fd2");
//        System.out.println(fd1);
//        System.out.println(fd2);
//    }
//}
