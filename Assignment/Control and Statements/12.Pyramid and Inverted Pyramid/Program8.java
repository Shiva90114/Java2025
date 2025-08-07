import java.util.Scanner;
class NumberReverse {

	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number of Rows :");
	int num = sc.nextInt();
	for(int i= 0;i<num;i++){
	     for(int j=0;j<i;j++){
	     System.out.print(" ");
	     }
	     for(int s=0;s<2*(num-i)-1;s++){	 
		     System.out.print(num-i);
	  }
         System.out.println();
	}
	sc.close();
	}

	}
