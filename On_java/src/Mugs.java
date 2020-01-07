// housekeeping/Mugs.java
// Instance initialization

import java.util.Arrays;

class Mug {
    Mug(int marker) {
        System.out.println("Mug(" + marker + ")");
    }
}

public class Mugs {
    Mug mug1;
    Mug mug2;
    { // [1]
        mug1 = new Mug(1);
        mug2 = new Mug(2);
        System.out.println("mug1 & mug2 initialized");
    }

    Mugs() {
        System.out.println("Mugs()");
    }

    Mugs(int i) {
        System.out.println("Mugs(int)");
    }

    public static void main(String[] args) {
        int [] intA = new int[5];
        System.out.println(intA[0]);
        System.out.println(Arrays.toString(intA));
        System.out.println("*********");
        char [] charA = new char[5];
        System.out.println(charA[0]);
        System.out.println(Arrays.toString(charA));
        System.out.println("*********");
        Character [] characterA = new Character[5];
        System.out.println(characterA[0]);
        System.out.println(Arrays.toString(characterA));
        System.out.println("*********");
        Integer [] IntegerA = new Integer[5];
        System.out.println(IntegerA[0]);
        System.out.println(Arrays.toString(IntegerA));
//        System.out.println("Inside main()");
//        new Mugs();
//        System.out.println("new Mugs() completed");
//        new Mugs(1);
//        System.out.println("new Mugs(1) completed");
    }
}
