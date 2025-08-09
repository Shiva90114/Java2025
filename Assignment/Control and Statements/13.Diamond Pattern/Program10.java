import java.util.Scanner;

class CharABC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows: ");
        int num = sc.nextInt();
        int totalRows = num * 2 - 1;

        for (int i = 1; i <= totalRows; i++) {
            int rowMax ;
	    if(i<= num){
	      rowMax =i;
	    }else{
	      rowMax = totalRows -i+1;
	    }
            int spaces = Math.abs(num - rowMax);

            for (int s = 0; s < spaces; s++) {
                System.out.print("  "); 
            }

            
            for (int j = rowMax; j >= 1; j--) {
                char ch =(char)('A'+num-j);
		System.out.print(ch + " ");
            }

           
            for (int j = 2; j <= rowMax; j++) {
                
	       char ch =(char)('A'+num-j);
	       System.out.print(ch + " ");
            }

            System.out.println();
        }
        sc.close();
    }
}

