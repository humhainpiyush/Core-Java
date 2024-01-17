interface A{
    int num = 4;
    void show();
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
