public class LaunchExc5 
{
    static ArithmeticException e;//this will result in NullPointerException
    // static ArithmeticException e = new ArithmeticException();
    public static void main(String... args) 
    {
        // throw new ArithmeticException("divide by zero");
        throw e;
    }
}