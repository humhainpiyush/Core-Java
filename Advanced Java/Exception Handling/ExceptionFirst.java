
//Error: 1.Syntax 2.Logical 3.Runtime -> this is also called an Exception

public class ExceptionFirst {
    public static void main(String[] args) {
        int number1 = 8;
        int number2 = 0;
        int result = 0;

        try
        {
            result = number1 / number2; //critical statement
        }
        catch(Exception e)
        {
            //critical statement threw an Exception which was catched by catch and
            //interpreted to us as the way we want
            System.out.println("Why bro? Why did you divide the number with zero");
        }

        System.out.println("Result: " + result);
        System.out.println("Bye!");
    }
}
