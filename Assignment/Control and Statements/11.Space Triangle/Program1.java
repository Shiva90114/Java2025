import java.util.Scanner;

class NumberPattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();
        printRightAlignedNumberPattern(numRows);
        scanner.close();
    }

    public static void printRightAlignedNumberPattern(int numRows) {
        for (int i = 1; i <= numRows; i++) {
            int totalWidthOfLastRow = (numRows * 2) - 1;
            int currentRowWidth = (i * 2) - 1;

            for (int j = 0; j < totalWidthOfLastRow - currentRowWidth; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print(k);
                if (k < i) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
