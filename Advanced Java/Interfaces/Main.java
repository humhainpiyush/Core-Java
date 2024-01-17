interface Computer
{
    void compileCode();
}

class Laptop implements Computer
{
    public void compileCode()
    {
        System.out.println("You got 5 errors.");
    }
}

class Desktop implements Computer
{
    public void compileCode()
    {
        System.out.println("You got 5 errors but faster.");
    }
}

class Developer
{
    public void buildApp(Computer obj)
    {
        System.out.println("Building App....");
        obj.compileCode();
    }
}

public class Main {
    public static void main(String[] args) {
        Computer obj = new Laptop();
        Developer dev = new Developer();
        dev.buildApp(obj);
    }
}
