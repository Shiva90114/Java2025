import java.util.*;

class Multiple {

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of rows: ");
        int num = sc.nextInt();
        
	int last = num * num;
        int max = String.valueOf(last).length();

      
       
        int total = 0;
	for (int i= 1; i<=num;i++){
	int number = num*i;
	String numStr = String.valueOf(number);
	total += max +1;
	}
	total -=1;


        for (int i = 1; i <= num; i++) {
         StringBuilder current = new StringBuilder();
         for (int j = 1; j <= i; j++) {
          int number = num * j;
                
          String numStr = String.valueOf(number);
          for (int k = 0; k < max - numStr.length(); k++) {
                current.append(" ");
                }
                current.append(numStr);
                if (j < i) { 
                current.append(" ");
                }
                }

         
                String row = current.toString();
            
       
            int leadingSpaces = total - row.length();
            for (int s = 0; s < leadingSpaces; s++) {
               System.out.print(" ");
            }
            System.out.println(row);
            }
            }
}

