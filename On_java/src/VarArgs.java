public class VarArgs {

    public static void main(String []args){
        printArray(1,2,3);
        printArray("one",2,3);
        printArray(new A(),new A(),new A());
        printArray((Object[]) new Integer[]{1,2,3});
        printArray();
    }


    private static void printArray(Object... args) {
        for(Object x : args) System.out.print(x+" ");
        System.out.println();
    }
}
class A{

}
