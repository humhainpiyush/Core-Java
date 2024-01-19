public class Pattern12 {
    public static void main(String[] args) {
        int n = 8;
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         if(i == j){
        //             System.out.print("* ");
        //         }                                       //this is for printing stars diagonally '\'
        //         else{
        //            System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }

        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         if(i + j == (n-1)){
        //             System.out.print("* ");
        //         }                               // this is for printing the stars diagonally in '/' way
        //         else{
        //            System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i == j || (i+j)== n-1){
                    System.out.print("* ");
                }
                else{                              // 'X' in this way
                   System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
