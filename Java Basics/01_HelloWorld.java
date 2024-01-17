public class HelloWorld {
    public static void main(String[] args) {
        int num = 101, rev = 0, lastDigit = 0;
        while(num != 0){
            lastDigit = num%10;
            rev = rev*10 + lastDigit;
            num = num/10;
        }
        System.out.println(rev);
    }
}
