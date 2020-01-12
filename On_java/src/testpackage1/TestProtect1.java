package testpackage1;

import testpackage.TestProtect;

public class TestProtect1 extends TestProtect {
    public void print() {
        super.printProtected();
    }

    @Override
    public void printProtected() {
        System.out.println("TestProtected1");
    }
    public static void main(String []args){
        TestProtect1 x = new TestProtect1();

        TestProtect xx = x;

        xx.printProtected();
    }
}
