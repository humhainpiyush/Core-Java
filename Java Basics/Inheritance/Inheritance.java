class Human{            //Super Class / Base Class / Parent Class
    int age;
    String name;

    Human(){
        System.out.println("Human Class");
    }
    void facts(){
        System.out.println("humans need 8 hours of sleep");
    }
    void setAge(int age){
        this.age = age;
    }
    void setName(String name){
        this.name = name;
    }
    int getAge(){
        return age;
    }
    String getName(){
        return name;
    }
}

class Student extends Human{    //Sub Class / Derived Class / Child Class
    Student(){
        System.out.println("Student class");
    }
    
    Student(String name, int age){
        this();                     //super() is called implicitly by the compiler
        this.name = name;
        this.age = age;
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Student st = new Student("Piyush", 15);
        // System.out.println(st.getName());
        // System.out.println(st.getAge());
        st.facts();
    }
}
