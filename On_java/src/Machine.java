

class Bing implements Operations{
    @Override
    public void excute(){
        Operations.show("Bing");
    }
}
class Crack implements Operations{
    @Override
    public void excute(){
        Operations.show("Crack");
    }
}
public class Machine {
    public static void main(String[] args) {
        Operations.tunOps(
                new Bing(), new Crack());
    }
}
