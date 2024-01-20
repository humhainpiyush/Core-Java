class Human{
    void works(){
        System.out.println("works");
    }
}

class Student extends Human{
    void works(){
        System.out.println("works in school");
    }

    void eats(){
        System.out.println("eats normal food");
    }
}

class Employee extends Human{
    void works(){
        System.out.println("works in factory"); // this is method overriding. it is called/decided at the runtime
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Employee e = new Employee();
        Student s = new Student();
        Human h = new Student(); //but cannot be converted from human to student
        h.works();
        h.eats();
    }
}
