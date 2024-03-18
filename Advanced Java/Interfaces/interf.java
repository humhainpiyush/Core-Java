interface A{
    int num = 4; //By default, variables are 'public', 'static' and 'final'
    void show(); //we cannot define a method inside an interface. We can only declare it
/*
    Properties: 
        1. By default, methods are 'public' and 'abstract'
        2. Interface cannot be instantiated
*/ 
}

interface B{
    void disp();
}

class C implements A,B{
   public void show(){
        System.out.println("Show methods");
    }
    public void disp(){
        System.out.println("Disp methods");
    }
}
public class interf {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
        obj.disp();
    }
}
