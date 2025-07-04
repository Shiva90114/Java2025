import java.util.*;

 class CharacterPattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int numRows = scanner.nextInt();
        printCharacterPattern(numRows);
        scanner.close();
    }

    public static void printCharacterPattern(int numRows) {
        char highestChar = (char) ('A' + numRows - 1); 

       
        int maxWidth = (numRows * 2) - 1; 

        for (int i = 1; i <= numRows; i++) { 
            int currentRowElements = i; 
            int currentPrintedWidth = (currentRowElements * 2) - 1; 

            
            for (int j = 0; j < maxWidth - currentPrintedWidth; j++) {
                System.out.print(" ");
            }

           
            char startCharInThisRow = (char)(highestChar - i + 1);

            for (char k = startCharInThisRow; k <= highestChar; k++) {
                System.out.print(k);
                
                if (k < highestChar) { 
                                      if (k != highestChar) { 
                         System.out.print(" ");
                    }
                }
            }
            System.out.println(); 
        }
    }
}
