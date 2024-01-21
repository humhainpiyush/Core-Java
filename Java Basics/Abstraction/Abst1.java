abstract class Haath
{
    //if no definition is given to the methods it is good to make the use of abstract methods and declare them in a class
    public abstract void assignmentKarna();
}

class Sharir extends Haath
{
    public void assignmentKarna()
    {
        System.out.println("College assignment doing");
    }
}

public class Abst1 {
    public static void main(String[] args) {
        Haath h = new Sharir();
        h.assignmentKarna();
        
    }
}
