import java.util.Scanner;

class Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Rows: ");
        int num = sc.nextInt();
	int count =1;

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++)
                System.out.print("  ");
            for (int j = 1; j <= 2*i - 1; j++)
             
			System.out.print(count++ + " ");
		
		
            System.out.println();
        }

        for (int i = num - 1; i >= 1; i--) {
            for (int j = 1; j <= num - i; j++)
                System.out.print("  ");
            for (int j = 1; j <= 2*i - 1; j++)
                
                        System.out.print(count++ + " ");

                
            System.out.println();
        }
        sc.close();
    }
}

