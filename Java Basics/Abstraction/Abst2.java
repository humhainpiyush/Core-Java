abstract class Human
{
    public abstract void eat();
}

class Student extends Human
{
    public void eat(){
        System.out.println("Student likes chhole bhature");
    }
    public void work(){
        System.out.println("He/she studies in school");
    }
}

public class Abst2 {
    public static void main(String [] args){
        Human h = new Student();
        h.eat();
        // h.work(); //error

        Student s = new Student();
        s.work();
        s.eat(); //not a member of Human so only Student obj can access this
    }
    
}
