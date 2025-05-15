package garbage;

import org.testng.annotations.Test;

public class D {

    @Test
    public void test1() {
        A x = new A();
        x.aA();
        x.aB();
        B y = new B();
        y.bB();
        y.bC();
        C z = new C();
        z.cC();
        z.cD();
    }

    @Test
    public void test2() {
        A x = new A();
        x.aA();
        x.aA();
        x.aB();
        B y = new B();
        y.b();
        y.bB();
        y.bC();
        C z = new C();
        z.C();
        z.cC();
        z.cD();
    }
}
