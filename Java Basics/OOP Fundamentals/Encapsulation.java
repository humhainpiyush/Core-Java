class Student {
    int rollNumber;
    String name;

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public int getRollNumber(){
        return rollNumber;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student st = new Student();
        st.setName("Piyush");
        st.setRollNumber(23);
        System.out.println(st.getName());
        System.out.println(st.getRollNumber());
    }
}
