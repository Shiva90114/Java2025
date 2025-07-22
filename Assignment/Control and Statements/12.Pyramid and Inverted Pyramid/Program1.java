import java.util.*;

class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows :");
	int rows = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            
            for (int s = 0; s < rows - i - 1; s++) {
                System.out.print("  ");
            }
         
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("1 ");
            }
            System.out.println();
         }
        }
}
