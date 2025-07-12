import java.util.*;

 class Character {

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of rows : ");
        int num = sc.nextInt();
        char Char = (char) ('A' + num - 1); 

       
        int max = (num * 2) - 1; 

        for (int i = 1; i <= num; i++) { 
            int element = i; 
            int width = (element * 2) - 1; 

            
            for (int j = 0; j < max - width; j++) {
                System.out.print(" ");
            }

           
            char startChar = (char)(Char - i + 1);

            for (char k = startChar; k <= Char; k++) {
                System.out.print(k);
                
                if (k < Char) { 
                         if (k != Char) { 
                         System.out.print(" ");
                         }
                }
                }
                System.out.println(); 
                }
                }
}

