import java.util.Scanner;

class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter of rows: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int s = 1; s <= num - i; s++) {
                System.out.print("  "); 
            }
	    int count = 2 * i - 1;
	    char ch; 
	    if(i%2 ==1){
	        ch ='A';
	    }else {
		    ch='a';
	    }
            for (int j = 1; j <= count; j++) {
                System.out.printf(ch+" ");
             ch = (char)(ch+1);
	    }
            System.out.println(); 
        }
        sc.close();
        }
}
