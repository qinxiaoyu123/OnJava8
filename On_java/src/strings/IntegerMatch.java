package strings;

public class IntegerMatch {
    public static void main(String[] args) {
        System.out.println("-1234".matches("-?\\d+"));
        System.out.println("-1".matches("-?\\d+"));
        System.out.println("5678".matches("-?\\d+"));
        System.out.println("+911".matches("-?\\d+"));
        //测试？
        System.out.println("+911".matches("(-|\\+)?\\d+"));
        System.out.println("++911".matches("(-|\\+)?\\d+"));
        System.out.println("911".matches("(-|\\+)?\\d+"));
    }
}
