public class Flower {
    private int preCount = 0;
    String s = "initial value";
    Flower(int preCount){
        this.preCount = preCount;
        System.out.println("Constructor w/ int arg only, preCount = " + preCount);
    }
    Flower(String s){
        System.out.println("Constructor w/ string arg only, s = " + s);
        this.s = s;
    }
    Flower(int preCount, String s){
        this(preCount);
        this.s = s;
        System.out.println("String & int args");
    }
    Flower(){
        this(7,"hi");
        System.out.println("no-arg constructor");
    }
    public void print(){
        System.out.println("preCount = " + preCount + " s = " + s);
    }

    public static void main(String []args){
        Flower flower1 = new Flower();
        flower1.print();
//        Tree tree1 = new Tree(1);
//        flower1.print();
//        flower1.preCount = 2;
//        flower1.print();
    }

}
class Tree{
    private int height;
    Tree(int height){
        this.height = height;
    }
}