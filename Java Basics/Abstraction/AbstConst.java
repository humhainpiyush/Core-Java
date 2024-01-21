abstract class Computer
{
    //Obj creation not possible but we can give constructor for abstract classes
    Computer(){
        System.out.println("Computer started!!");
    }
    public abstract void compile();
}

class Laptop extends Computer
{
    Laptop(){
        System.out.println("Laptop's ON");
    }
    public void compile(){
        System.out.println("Compiling 6 programs...");
    }
}

public class AbstConst {
    public static void main(String[] args) {
        Computer c = new Laptop();
        c.compile();
    }
}
