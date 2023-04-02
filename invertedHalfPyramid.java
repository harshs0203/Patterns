import java.util.Scanner;

public class invertedHalfPyramid {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height;

        System.out.print("Enter the height of triangle\t");
        height = s.nextInt();

        for(int i = 1; i <= height; i++){
            for(int j = 1; j < i; j++){
                System.out.print(" * ");
            }
            System.out.println();;
        }

        s.close();
    }
}
