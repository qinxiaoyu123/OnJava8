package innerclasses;

public class OuterClass {
    public static void main(String []args){
        Parcel1 p = new Parcel1();
        Parcel1.Contents c = p.contents();
        Parcel1.Destination d = p.to("aaa");
    }
}
