interface A 
{
/*
JAVA8 features:
    1. In JAVA 8, we can declare and define the methods at the same time and same place
    2. Those defined methods may be static or non-static
*/
    void show();
    default void config() //defining non-static methods inside an interface
    {
        System.out.println("inside config");
    }

    static void abc() //defining static methods inside an interface
    {
        System.out.println("inside abc");
    }
}

class B implements A
{
    public void show()
    {
        System.out.println("inside show");
    }
}

public class Java8Fe {
    public static void main(String[] args) {
        A.abc();
        // A.config(); --> result in error because it is a non-static method
        A obj = new B();
        obj.config();
        obj.show();
    }
}
