package collections;

import java.util.ArrayList;

class Apple{
    private static long counter;
    private final long id = counter++;
    public String toString(){
        return String.valueOf(id);
    }
    public long id() {
        return id;
    }
}
class Orange{
    
}
public class ApplesAndOrangesWithoutGenerics {
//    @SuppressWarnings("unchecked")
    public static void main(String []args){
        ArrayList <Apple>apples = new ArrayList();
        for(int i =0;i<3;i++)
            apples.add(new Apple());
//        apples.add(new Orange());
        for(Object apple: apples){
            System.out.println(apple);
            ((Apple) apple).id();

        }
    }

}
