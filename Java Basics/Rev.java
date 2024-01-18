public class Rev {
    public static void main(String[] args) {
        String binaryString = "54321";
        String reversedString = reverseBinaryString(binaryString);
        System.out.println("Reversed binary string: " + reversedString);
    }
    
    public static String reverseBinaryString(String binaryString) {
        StringBuilder reversed = new StringBuilder(binaryString).reverse();
        return reversed.toString();
    }
}
