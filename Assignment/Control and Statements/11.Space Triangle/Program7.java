import java.util.*;

class pattern{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
     
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

     
        for (int i = 0; i < rows; i++) {
          
            for (int s = 0; s < i; s++) {
                System.out.print(" ");
            }

         
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(j);
            }

          
            System.out.println();
        }

        scanner.close();
    }
}
