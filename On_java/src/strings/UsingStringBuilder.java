package strings;

import java.util.Random;
import java.util.stream.Collectors;

public class UsingStringBuilder {
    public static String string1(){
        Random random = new Random(47);
        StringBuilder result = new StringBuilder("[");
        for(int i = 0;i<25;i++){
            result.append(random.nextInt(100));
            result.append(", ");
        }
        //不包含右区间result.length()
        result.delete(result.length()-2,result.length());
        result.append("]");
        return result.toString();
    }
    public static void testStringBuilder(){
        StringBuilder result = new StringBuilder();
        result.insert(0,"qinxiaoyu");
        System.out.println(result);
        //不包含右区间result.length()-1
        result.replace(0,result.length()-1,"wangzhaoning");
        System.out.println(result);
        result.reverse();
        System.out.println(result);
    }
    public static String string2(){
        String result = new Random(47).ints(25,0,100).mapToObj(Integer::toString).collect(Collectors.joining(", "));
        return "[" +result+"]";
    }
    public static void main(String []args){
        System.out.println(string1());
        System.out.println(string2());
        testStringBuilder();
    }
}
