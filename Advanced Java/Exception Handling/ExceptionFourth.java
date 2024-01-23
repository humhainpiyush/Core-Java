public class ExceptionFourth {
    public static void main(String[] args) {
        int number1 = 8;
        int number2 = 0;
        int result;

        try
        {
            System.out.println("try block executing...");
            result = number1 / number2;
        }

        catch(Exception e){
            // e.printStackTrace();//default method to print exception if not provided a catch block
            // System.out.println(e.toString());
            System.out.println(e.getMessage());//only the description
        }
        finally{System.out.println("Sirf exception hai baaki sab nipta diya");}
    }
}
