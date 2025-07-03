import java.util.*;

class Revised {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();

        for (int i = 0; i < numRows; i++) {
            
            if (i % 2 == 0) { 
                char charToPrint = (char) ('A' + (numRows - 1) - (i)); 
                System.out.print(charToPrint + " ");
                for (int j = 1; j < numRows; j++) { 
                    System.out.print(charToPrint + " ");
                }
            } else { 
                int numToPrint = numRows - i; 
                System.out.print(numToPrint + " ");
                for (int j = 1; j < numRows; j++) { 
                    System.out.print(numToPrint + " ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
