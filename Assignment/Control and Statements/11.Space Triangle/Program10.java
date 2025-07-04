import java.util.Scanner;

class RightAlignedDecreasingPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the input number (n): ");
        int n = sc.nextInt();
        sc.close();

        // Calculate the maximum length of the full row
        // For n=3, "C B A" has length 5
        // For n=4, "D C B A" has length 7
        // Each character + a space, except the last one
        int maxLength = (n * 2) - 1;

        // Loop through each row
        for (int i = 0; i < n; i++) {
            StringBuilder currentRow = new StringBuilder();

            // Build the string for the current row
            // The starting character for the row is 'A' + (n - 1)
            // The loop goes from the starting character down to 'A' + i
            for (int j = n - 1; j >= i; j--) {
                char ch = (char) ('A' + j);
                currentRow.append(ch);
                if (j > i) { // Add space after character, but not after the last one
                    currentRow.append(" ");
                }
            }

            // Calculate leading spaces for right alignment
            int leadingSpaces = maxLength - currentRow.length();

            // Print leading spaces
            for (int k = 0; k < leadingSpaces; k++) {
                System.out.print(" ");
            }

            // Print the current row string
            System.out.println(currentRow.toString());
        }
    }
}
