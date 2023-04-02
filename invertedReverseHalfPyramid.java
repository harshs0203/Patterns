import java.util.Scanner;

public class invertedReverseHalfPyramid {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int height;

        System.out.print("Enter the height of triangle\t");
        height = s.nextInt();

        for(int i = 1; i <= height; i++){
            for(int j = height; j >= i; j--){
                if( j >= i ){
                    System.out.print("*");
                }else{
                    System.out.print(" "); 
                }
            }
            System.out.println();;
        }

        s.close();

    }
}

//         *    
//       * *
//     * * *
//   * * * *
// * * * * *