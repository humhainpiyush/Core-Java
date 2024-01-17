
//Lambda expression works only for the functional interface

interface Car
{
    void drive();
}

interface Dog
{
    void bark(int volumeLevel);
}

public class LambdaExpression {
    public static void main(String[] args) {
        //Anonymous inner class can also be written as : if there is no argument
        Car obj = () -> System.out.println("Drive defined through anonymous inner class");
        obj.drive();
        //This is the example of passing an agrument in the functional interface
        Dog d = volumeLevel -> System.out.println("Barking... : " + volumeLevel);
        d.bark(7);
    }
}