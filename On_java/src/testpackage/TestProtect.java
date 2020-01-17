package testpackage;

public class TestProtect {
    private int i = 0;

    void print() {
        System.out.println(i);
    }

    public void printProtected() {
        System.out.println("protected" + i);
        int t = new TestProtect().i;
    }

}
