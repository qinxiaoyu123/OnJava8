package strings;

import java.util.Formatter;

public class Conversion {
    public static void main(String []args){
        Formatter f = new Formatter(System.out);
        char u = 'a';
        System.out.println("u = 'a'");
        //char转String
        f.format("s: %s%n", u);
        //char不能转整形
        //f.format("s: %d%n", u);
        //char转Unicode字符
        f.format("s: %c%n", u);
        //char转boolean
        f.format("s: %b%n", u);
        //char不能转浮点数（十进制）
        //f.format("s: %f%n", u);
        //char不能转科学技术法
        //f.format("s: %e%n", u);
        //char不能转十六进制整形
        //f.format("s: %x%n", u);
        //散列码
        f.format("s: %h%n", u);

        int v = 121;
        System.out.println("v = 121");
        f.format("d: %d%n", v);
        f.format("c: %c%n", v);
        f.format("b: %b%n", v);
        f.format("s: %s%n", v);
        // f.format("f: %f%n", v);
        // f.format("e: %e%n", v);
        f.format("x: %x%n", v);
        f.format("h: %h%n", v);

        double x = 179.543;
        System.out.println("x = 179.543");
        // f.format("d: %d%n", x);
        // f.format("c: %c%n", x);
        f.format("b: %b%n", x);
        f.format("s: %s%n", x);
        f.format("f: %f%n", x);
        f.format("e: %e%n", x);
        // f.format("x: %x%n", x);
        f.format("h: %h%n", x);

        Conversion y = new Conversion();
        System.out.println("y = new Conversion()");

        // f.format("d: %d%n", y);
        // f.format("c: %c%n", y);
        f.format("b: %b%n", y);
        f.format("s: %s%n", y);
        // f.format("f: %f%n", y);
        // f.format("e: %e%n", y);
        // f.format("x: %x%n", y);
        f.format("h: %h%n", y);

        boolean z = false;
        System.out.println("z = false");
        // f.format("d: %d%n", z);
        // f.format("c: %c%n", z);
        f.format("b: %b%n", z);
        f.format("s: %s%n", z);
        // f.format("f: %f%n", z);
        // f.format("e: %e%n", z);
        // f.format("x: %x%n", z);
        f.format("h: %h%n", z);
    }
}
