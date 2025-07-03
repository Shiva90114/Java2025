import java.util.*;

class Symbol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of Rows :");
	int num = sc.nextInt(); 

        for (int i = 0; i < num; i++) {
            char symbol;
            if (i % 3 == 0)
                symbol = '#';
            else if (i % 3 == 1)
                symbol = '$';
            else
                symbol = '@';

            for (int j = 0; j < 3; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }
}
