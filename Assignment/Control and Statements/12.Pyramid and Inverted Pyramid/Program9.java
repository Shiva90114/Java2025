import java.util.Scanner;
class NumberStart1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Rows :");
        int num = sc.nextInt();
        for(int i = 0; i < num; i++){
            for(int j = 0; j < i; j++){
                System.out.print("  ");
            }
            int count = 2 * (num - i) - 1;
            for(int s = 1; s <= count; s++){
                System.out.print(s);
                if(s != count) {
			System.out.print(" ");
            } 
	    }
            System.out.println();
        }
        sc.close();
    }
}

