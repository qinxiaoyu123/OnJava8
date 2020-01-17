public class SingletonPattern {
    private int i ;
    final static SingletonPattern singleton = new SingletonPattern(1);
    private SingletonPattern(int i ){
        this.i = i;
    }
    public static SingletonPattern getObject(){
            return singleton;
    }
}

class Main{
    public static void main(String[] args) {
        SingletonPattern instance = SingletonPattern.getObject();
        SingletonPattern instance1 = SingletonPattern.getObject();
        System.out.println(instance+" "+instance1);

    }
}
