package exceptions;

class SimpleException extends Exception{}
class A{
    public String toString(){
        return "a";
    }

}
public class InheritingExceptions {
    public void f() throws SimpleException{
        System.out.println("Throw SimpleException from f()");
        throw new SimpleException();
    }
    public static void main(String []args){
        InheritingExceptions sed = new InheritingExceptions();
        A a = new A();

        try{
            sed.f();
        }catch (SimpleException e){
            System.out.println(e.toString());
            System.out.println("Caught it!");
        }
    }
}
