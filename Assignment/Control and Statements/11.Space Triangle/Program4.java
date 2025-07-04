import java.util.Scanner;

class MultiplesPattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();
        printMultiplesPattern(numRows);
        scanner.close();
    }

    public static void printMultiplesPattern(int numRows) {
       
        int lastNumberInLastRow = numRows * numRows;
        int maxDigitWidth = String.valueOf(lastNumberInLastRow).length();

      
        // Total width = (numRows * maxDigitWidth) + (numRows - 1) * 1 (for single spaces between numbers)
        int totalRowWidth = (numRows * maxDigitWidth) + (numRows > 0 ? numRows - 1 : 0);

        for (int i = 1; i <= numRows; i++) {
            StringBuilder currentRow = new StringBuilder();
            for (int j = 1; j <= i; j++) {
                int number = numRows * j;
                
                String numStr = String.valueOf(number);
                for (int k = 0; k < maxDigitWidth - numStr.length(); k++) {
                    currentRow.append(" ");
                }
                currentRow.append(numStr);
                if (j < i) { 
                    currentRow.append(" ");
                }
            }

         
            String rowString = currentRow.toString();
            
       
            int leadingSpaces = totalRowWidth - rowString.length();
            for (int s = 0; s < leadingSpaces; s++) {
                System.out.print(" ");
            }
            System.out.println(rowString);
        }
    }
}
