public class StaticClass{
    public static void main(String[] args) {
        static int a = 10;
        System.out.println("Main method");

        static class Test{
            static{

                System.out.println("Static test class" + a);
            }
        }
    }
}