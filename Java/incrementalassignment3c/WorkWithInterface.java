package incrementalassignment3c;


interface A {
    public void a();

    public void b();
}

interface B {
    public void a();

    public void b();
}

interface C {
    public void a();

    public void b();
}

interface D extends A, B, C {
    public void c();
}

class Concrete {

}

public class WorkWithInterface extends Concrete implements D {
    static void m(A a) {

    }

    static void n(B b) {

    }

    static void o(C c) {

    }

    static void p(D d) {

    }

    public static void main(String[] args) {
        WorkWithInterface random = new WorkWithInterface();
        m(random);
        n(random);
        o(random);
        p(random);
    }

    @Override
    public void a() {

    }

    @Override
    public void b() {

    }

    @Override
    public void c() {

    }

}
