package exceptions;

class VeryImportantException extends Exception{
    public String toString(){
        return "A very important exception!";
    }
}
class HoHumException extends Exception{
    public String toString(){
        return "A trivial exception!";
    }
}
public class LostMessage {
    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }
    void dispose() throws HoHumException {
        throw new HoHumException();
    }
    public static void main(String []args) throws VeryImportantException, HoHumException {
        try{
            LostMessage lm = new LostMessage();
            try{
                lm.f();
            }finally{
                lm.dispose();
            }
        }catch(VeryImportantException | HoHumException e){
            System.out.println(e);
        }

    }
}
