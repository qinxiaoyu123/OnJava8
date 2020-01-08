import sun.security.provider.Sun;

class Sundae {
    private Sundae() {System.out.println("aaa");}
    static Sundae makeASundae() {
        return new Sundae();
    }
}

public class IceCream {
    public static void main(String[] args) {
        //- Sundae x = new Sundae();
        Sundae x = Sundae.makeASundae();
        Sundae x1 = Sundae.makeASundae();
    }
}