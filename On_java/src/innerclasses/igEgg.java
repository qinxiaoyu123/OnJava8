package innerclasses;

class Egg{
    private Yolk y;
    protected class Yolk{
        public Yolk(){
            System.out.println("Egg.Yolk()");
        }
    }
    Egg(){
        System.out.println("New Egg()");
        y = new Yolk();
    }
}
public class igEgg extends Egg{
    public class Yolk{
        public Yolk(){
            System.out.println("ig.Egg");
        }
    }
    public static void main(String []args){
        new igEgg();
    }
}

