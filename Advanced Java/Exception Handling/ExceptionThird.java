import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionThird {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        try{
            num = sc.nextInt();
            // sc.close();//in case there is exception. so the resource will never be closed
        }
        catch(InputMismatchException e){
            System.out.println("please enter a number");
        }
        finally
        {
            sc.close();//finally block will get executed either the critical statement throws an exception or not
            //ultimately the resource will get closed
        }
        System.out.println("Your entered number is: " + num);
    }
}
