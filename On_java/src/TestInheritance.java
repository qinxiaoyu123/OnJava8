
class Shape{
    private String line = "Shape line";
    Shape(String line){
        this.line = line;
        System.out.println("Shape");
    }
    public void draw(){
        System.out.println("Shape draw");
    }
}
class Circular extends Shape{
    private Other o = new Other();
    final int b;
    static{
        System.out.println("static circular");
    }
    private int c;
    Circular(String line, int b) {
        super(line);
        this.b = b;
        System.out.println("Circular");
    }

    @Override
    public void draw() {
        System.out.println("circular draw");
    }
}
class Other{
    private int o;
    Other(){
        System.out.println("Other");
    }
}
public class TestInheritance {
    public static void main(String[]args){
        Circular c = new Circular("circular", 2);
        c.draw();
        Shape a = c;
        a.draw();

    }
}
