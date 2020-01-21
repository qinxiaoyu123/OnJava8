

interface InterfaceWithDefault{
    void firstMethod();
    void secondMethod();
    default void thirdMethod(){
        System.out.println("third method");
    }
}
public class Implementation2 implements InterfaceWithDefault{
    @Override
    public void firstMethod(){
        System.out.println("Implementation2 first method");
    }
    public void secondMethod(){
        System.out.println("Implementation2 second method");
    }
    public static void main(String []args){
        Implementation2 imp = new Implementation2();
        imp.firstMethod();
        imp.secondMethod();
        imp.thirdMethod();
    }


}
