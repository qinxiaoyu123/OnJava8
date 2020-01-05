public class Operator {
    public static void main(String[] args) {
        int[] aa = new int[5];
//        for(int i = 0; i<5;i++){
//            aa[i] = i;
//        }
        for (int x : aa) {
            System.out.println(x);
        }
        String x = "qinxiaoyu";
        switch (x) {
            case "wzn":
                System.out.println("lallal");
                break;
            case "qinxiaoyu":
                System.out.println("aaa");
                break;
            default:
                break;
        }
        for (char c : "An African Swallow".toCharArray())
            System.out.print(c + " ");
    }


}
