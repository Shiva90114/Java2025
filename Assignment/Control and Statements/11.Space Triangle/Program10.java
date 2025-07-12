import java.util.*;

class Pattern10 {

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter No. of Rows : ");
        int num = sc.nextInt();
       
	int Length = (num * 2) - 1;

        
        for (int i = 0; i < num; i++) {
            StringBuilder Row = new StringBuilder();

          
            for (int j = num - 1; j >= i; j--) {
                char ch = (char) ('A' + j);
                Row.append(ch);
                if (j > i) { 
                    Row.append(" ");
                }
            }

         
            int spaces = Length - Row.length();

          
            for (int k = 0; k < spaces; k++) {
                System.out.print(" ");
            }

            
            System.out.println(Row.toString());
        }
	sc.close();
        }
}
