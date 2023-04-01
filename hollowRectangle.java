import java.util.Scanner;

public class hollowRectangle {
    public static void main(String[] args) {
        
        int rows;
        int columns;
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the beadth  ");
        rows = s.nextInt();
        
        System.out.print("Enter the length  ");
        columns = s.nextInt();
        
        //for rows
        for(int i = 0; i < rows; i++){
            //for columns
            for(int j = 0; j < columns;j++){
               if( i == 0 || j ==0 || i == rows || j==columns ){
                System.out.print(" * ");
               }
            }
            System.out.println();
        }
        
        s.close();

    }
}

// * * * * 
// *     * 
// *     * 
// * * * * 