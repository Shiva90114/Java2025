import java.util.*;

class IncreasingPattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();
       
        for (int i = 1; i <= numRows; i++) { 
            int leadingSpaces = (i - 1) * 2;

            for (int s = 0; s < leadingSpaces; s++) {
                System.out.print(" ");
            }

            
            for (int j = i; j <= numRows; j++) {
                System.out.print(j);
                if (j < numRows) { 
                    System.out.print(" ");
                }
            }
            System.out.println(); 
        }
	scanner.close();
    }
}
