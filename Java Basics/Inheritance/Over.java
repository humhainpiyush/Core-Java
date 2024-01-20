class Parent
{
    int x = 10;
    {
        methodOne();
        System.out.println("Parent first instance block");
    }
    Parent()
    {
        System.out.println("Parent class constructor");
    }
    public static void main(String[] args) {
        Parent p = new Parent();
        System.out.println("Parent class main()");
    }
    public void methodOne()
    {
        System.out.println(y);
    }
    int y = 20;
}

class Child extends Parent
{
    int i = 100;
    {
        methodTwo();
        System.out.println("Child first instance block");
    }
    Child()
    {
        System.out.println("Child class constructor");
    }
    public static void main(String[] args) {
        Child c = new Child();
        System.out.print("Child class main()");
    }
    public void methodTwo()
    {
        System.out.println(j);
    }
    int j = 200;
}
public class Over {
    public static void main(String[] args) {
        Child c1 = new Child();
        
    }
}
