class Student {
    int rollNumber;
    String name;

    Student(){
        this("Ayush", 69);
        System.out.println("Zero parameterized constructor");
    }

    Student(String name, int rollNumber){
        // this();
        // super();
        System.out.println("Parameterized constructor");
        this.name = name;
        this.rollNumber = rollNumber;
    }

    // public void setRollNumber(int rollNumber) {
    //     this.rollNumber = rollNumber;
    // }
    // public void setName(String name) {
    //     this.name = name;
    // }
    public String getName(){
        return name;
    }
    public int getRollNumber(){
        return rollNumber;
    }
}

public class Constructor {
    public static void main(String[] args) {
        // Student st1 = new Student();
        Student st = new Student("piyush", 12);
        System.out.println(st.name + "\n" + st.rollNumber);
    }
}
