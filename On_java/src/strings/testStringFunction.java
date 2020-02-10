package strings;

import java.util.Arrays;

public class testStringFunction {
    public static void testFunction(){
        String s = "123456789";
        System.out.println(s.length());
        System.out.println(s.charAt(3));
        char[] dest = new char[16];
        int i = 0;
        for(char c : Arrays.asList('a','b','c')){
            dest[i++] = c;
        }
        s.getChars(0,s.length(),dest,3);
        System.out.println(dest);
        String s1 = "abc";
        String s2 = "ABC";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareToIgnoreCase(s2));
        System.out.println(s1.contains("ac"));
        System.out.println(s1.contentEquals("abc"));
    }
    public static void main(String []args){
        testFunction();
    }
}
