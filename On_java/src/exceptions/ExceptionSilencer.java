package exceptions;

public class ExceptionSilencer {
    public static void main(String []args){
        try{
            try{
                throw new RuntimeException();
            }finally {
                return;
            }
        }
        catch(RuntimeException e){
            System.out.println("Caught it !");
        }

    }
}
