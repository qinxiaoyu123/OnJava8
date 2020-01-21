interface InterfaceOne{
    default void play(){
        System.out.println("Interface One play");
    }
}
interface InterfaceTwo{
    default void play(){
        System.out.println("Interface Two");
    }
}
interface InterfaceThree{
    default void playThree(){
        System.out.println("Interface three");
    }
}
class MOne implements InterfaceOne, InterfaceTwo, InterfaceThree{
     public void play(){
        InterfaceOne.super.play();
    }
}
public class MultipleInheritance {
    public static void main(String []args){
        MOne m = new MOne();
        m.play();
        m.playThree();
    }



}
