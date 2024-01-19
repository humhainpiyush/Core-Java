class Demo{
    static int a;
    static int b;

    static
    {
        System.out.println("This is static block");
        a = 10;
        b = 20;
    }

    void disp1(){
        System.out.println("This is non-static method block");
    }

    static void disp(){
        System.out.println("This is static method block");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
}
public class Static{

    public static void main(String [] args){
        Demo d = new Demo();
        Demo.disp();
        d.disp1();
    }
}