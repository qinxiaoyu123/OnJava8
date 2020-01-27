package innerclasses;

class Parcel5 {
    private class PContents implements Contents{
        private int i = 11;
        @Override
        public int value() {
            return i;
        }
    }
    final class PDestination implements Destination{
        private String label;
        private PDestination(String whereTo){
            label = whereTo;
        }
        @Override
        public String readLable() {
            return label;
        }
    }
    public PDestination to(String s){
        return new PDestination(s);
    }
    public Contents contents(){
        return new PContents();
    }

}
public class TestParcel {
    public static void main(String []args){
        Parcel5 p = new Parcel5();
        Contents c = p.contents();
        Parcel5.PDestination d = p.to("qinxiaoyu");

    }
}
