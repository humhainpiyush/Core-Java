interface Car
{
    void drive();
}
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Car obj = new Car() {
            public void drive(){
                System.out.println("Drive defined through anonymous inner class");
            }
        };
        obj.drive(); //this syntax can be made short through lambda expression
    }
}