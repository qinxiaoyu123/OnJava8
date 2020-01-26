package interfaces.filters;

interface CanFight{
    void fight();
}
interface CanSwim{
    void swim();
}
interface CanRun{
    void run();
}
class Action{
    public void fight(){};
        }
class Hero extends Action implements CanFight, CanRun, CanSwim{

    @Override
    public void swim() {

    }

    @Override
    public void run() {

    }

//    @Override
//    public void run() {
//
//    }
}
public class Adventure{
    static final int a = 0;

    final Adventure aa = null;



    public static void main(String []args){

        Hero h = new Hero();
        t(h);

    }

    private static void t(CanSwim h) {
        h.swim();
    }
}
