package innerclasses;

public class Parcel1 {
    class  Contents{
        private int i;
        public int value(){
            return i;
        }
    }
    class Destination{
        private String label;
        Destination(String s){
            label = s;
        }
        String readLable(){
            return label;
        }
    }
    public Destination to (String label){
        return new Destination(label);
    }
    public Contents contents(){
        return new Contents();
    }
    public void ship(String dest){
        Contents c = new Contents();
        Destination d = new Destination(dest);
        System.out.println(d.readLable());
    }
    public void createInnerClass(String dest){
        Parcel1.Contents c = new Contents();
        Parcel1.Destination d = new Destination(dest);
    }
    public static void main(String[]args){
        Parcel1 p = new Parcel1();
        p.ship("qinxiaoyu");
        Contents c = p.contents();
        Destination d = p.to("wangzhaoning");
    }
}
