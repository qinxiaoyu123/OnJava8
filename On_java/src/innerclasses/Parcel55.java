package innerclasses;

public class Parcel55 {
    public Destination destination(String s){
        final class PDestination implements Destination{
            private String label;
            @Override
            public String readLable() {
                return label;
            }
            private PDestination(String whereTo){
                label = whereTo;
            }
        }
        return new PDestination(s);
    }
    public static void main(String []args){
        Parcel55 p = new Parcel55();
        Destination d = p.destination("qinxiaoyu");
    }
}
