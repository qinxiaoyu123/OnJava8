import java.util.Arrays;

public class Operator {
    static int n = 1;
    static int []s = new int [2*n];
    public static void main(String[] args) {
//        int[] aa = new int[5];
//        for(int i = 0; i<5;i++){
//            aa[i] = i;
//        }
//        swap(aa[1],aa[2]);
//        System.out.println(aa[1]+" "+aa[2]);

        System.out.println(Arrays.toString(s));
        n = 2;
        System.out.println(Arrays.toString(s));
//        for (int x : aa) {
//            System.out.println(x);
//        }
//        String x = "qinxiaoyu";
//        switch (x) {
//            case "wzn":
//                System.out.println("lallal");
//                break;
//            case "qinxiaoyu":
//                System.out.println("aaa");
//                break;
//            default:
//                break;
//        }
//        for (char c : "An African Swallow".toCharArray())
//            System.out.print(c + " ");
    }

    private static void swap(int i, int i1) {
        int tmp = i1;
        i1  = i;
        i = tmp;
    }


}
