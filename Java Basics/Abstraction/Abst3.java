abstract class A
{
    abstract void m1();
    abstract void m2();
    abstract void m3();
}

abstract class B extends A
{
    void m1(){
        System.out.println("m1-B");
    }
    void m2(){
        System.out.println("m2-B");
    }

    //if we extend an abstract class with abstract methods then we have to define all the abstract methods in the parent abstract class
}

class C extends B
{
    void m3(){
        System.out.println("m3-C");
    }

    //But we can make the previous class abstract and extend it to another new class
    //using multi-level heritance
}

public class Abst3 {
    public static void main(String[] args) {
        // A a = new B();
        // a.m1();//error
        // a.m2();//error

        A a = new C();
        a.m1();
        a.m2();
        a.m3();
    }
}
