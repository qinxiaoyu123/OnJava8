import java.util.Arrays;

public class OverloadingVarargs2 {
    static void f(float i, Character... args) {
        System.out.println(i);
        System.out.println(Arrays.toString(args));
        System.out.println("first");
    }

    static void f(char c, Character... args) {
        System.out.println("second");
    }
//    static void f(char c, char a) {
//        System.out.println("second");
//    }

    public static void main(String[] args) {
//        f(1, 'a');
        f('a', 'b');
//        System.out.println((float) 'r');
    }
}
