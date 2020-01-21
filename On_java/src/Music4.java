

abstract class Instrument{
    abstract void play();
    String what(){
        return "Instrument";
    }
    abstract void adjust();


}
class Wind extends Instrument{
    @Override
    void play(){
        System.out.println("Wind play");
    }
    @Override
    String what(){
        return "Wind";
    }
    @Override
    void adjust(){
        System.out.println("Wind adjust");
    }
}
class Percussion extends Instrument{
    void play(){
        System.out.println("Percussion play");
    }
    String what(){
        return "Percussion";
    }
    void adjust(){
        System.out.println("Percussion adjust");
    }
}
class Stringed extends Instrument{
    void play(){
        System.out.println("Stringed play");
    }
    String what(){
        return "Stringed";
    }
    void adjust(){
        System.out.println("Stringed adjust");
    }
}
class Woodwind extends Wind{
    void play(){
        System.out.println("Woodwind play");
    }
    String what(){
        return "Woodwind what";
    }
}
class Brass extends Wind{
    void play(){
        System.out.println("Brass play");
    }
    void adjust(){
        System.out.println("Brass adjust");
    }
}

public class Music4 {
    public static void main(String []args){
        Instrument[] ary = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(ary);
    }

    private static void tuneAll(Instrument[] ary) {
        for(Instrument i :ary){
            tune(i);
        }
    }

    private static void tune(Instrument i) {
        i.play();
    }

}




















