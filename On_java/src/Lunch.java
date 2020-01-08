class Soup1{
    private Soup1(){
        System.out.println("create Soup1");
    }
    public static Soup1 accessSoup1(){
        return new Soup1();
    }

}
class Soup2{
    static Soup2 soup2 = new Soup2();
    private Soup2(){
        System.out.println("create Soup2");
    }
    public static Soup2 accessSoup2(){
        return soup2;
    }

}
public class Lunch{
    public static void main(String []args){
        Soup1 soup1 = Soup1.accessSoup1();
        Soup2 soup2 = Soup2.accessSoup2();
    }
}