import java.util.Scanner;

class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter of rows: ");
        int num = sc.nextInt();
	

        for (int i = 1; i <= num; i++) {
            for (int s = 1; s <= num-i; s++) {
                System.out.print("  "); 
            }
	    
            for (int j = 1; j <= 2*i - 1; j++) {
                System.out.printf(j+" ");
               
	    }
            System.out.println(); 
        }
        sc.close();
        }
}
