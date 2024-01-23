public class ExceptionSecond {
    public static void main(String[] args) {
        int number1 = 8;
        int number2 = 0;
        int result = 0;
        int array[] = {1,2,3,4,5};

        try
        {
            result = number1 / number2; //critical statement
            System.out.println(array[7]);
        }
        catch(ArithmeticException e) //Exception class is the super-class of all the exceptions
        {
            System.out.println("you can't divide a number by zero"); //but we can mention its subclasses objects too
        }
        //We can also have multiple catch blocks for a try block to handle different critical statements
        catch(ArrayIndexOutOfBoundsException ae)
        {
            System.out.print("stay within your limits");
        }

        System.out.println("Result: " + result);
        System.out.println("Bye!");
    }
}
