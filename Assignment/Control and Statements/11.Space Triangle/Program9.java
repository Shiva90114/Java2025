import java.util.Scanner;

class RightAlignLastElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input as space-separated values
        System.out.print("Enter space-separated values: ");
        String inputLine = sc.nextLine();

        // Split into array
        String[] values = inputLine.trim().split("\\s+");
        int n = values.length;

        // Calculate total width of full row
        int totalWidth = 0;
        for (int i = 0; i < n; i++) {
            totalWidth += values[i].length();
        }
        totalWidth += (n - 1); // spaces between values

        // Print pattern
        for (int i = 0; i < n; i++) {
            // Calculate how much width to skip
            int skipWidth = 0;
            for (int j = 0; j < i; j++) {
                skipWidth += values[j].length() + 1;
            }

            // Print spaces
            for (int s = 0; s < skipWidth; s++) {
                System.out.print(" ");
            }

            // Print remaining values
            for (int j = i; j < n; j++) {
                System.out.print(values[j]);
                if (j != n - 1) {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
