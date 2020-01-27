package innerclasses;

public class Parcel7b {
    public class MContents implements Contents{
        private int i;
        @Override
        public int value() {
            return i;
        }
    }
    public Contents contents(){
        return new MContents();
    }
    public static void main(String []args){
        Parcel7b p = new Parcel7b();
        Contents c = p. new MContents();
    }
}

