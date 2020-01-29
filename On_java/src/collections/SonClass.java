package collections;

class FatherClass{
    public void fatherMethod(){
        System.out.println("fatherMethod");
    }
}
public class SonClass extends FatherClass{
    @Override
    public void fatherMethod(){
        System.out.println("son-fatherMethod");
    }
    public void sonMethod(){
        System.out.println("sonMethod");
    }
    public static void main(String []args){


        FatherClass s = new SonClass();
        s.fatherMethod();
    }
}
