import java.util.Scanner;

class Rectangle {

public static void main(String[] args) {
    
 int rows;
int columns;
Scanner s = new Scanner(System.in);

System.out.print("Enter the numbr of rows  ");
rows = s.nextInt();

System.out.print("Enter the numbr of columns  ");
columns = s.nextInt();

//for rows
for(int i = 0; i < rows; i++){
    //for columns
    for(int j = 0; j < columns;j++){
        System.out.print(" * ");
    }
    System.out.println();
}

s.close();
}

}