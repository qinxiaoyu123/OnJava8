package innerclasses;

class WithInnner{
    class Inner{

    }
}
public class InheritInner extends WithInnner.Inner{
    InheritInner(WithInnner wi){
        wi.super();
    }
    public static void main(String []args){
        WithInnner wi = new WithInnner();
        InheritInner ii = new InheritInner(wi);
    }
}
