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
    }
}
