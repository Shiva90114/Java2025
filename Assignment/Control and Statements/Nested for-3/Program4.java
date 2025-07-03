import java.util.*;

class NumDouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
           

                for (int j = 1; j <=num ; j++) {
                    
		    int value = i*j;	
                    System.out.print(value + "\t ");

		   
                
            }
            System.out.println();
        }

        sc.close();
    }
}
