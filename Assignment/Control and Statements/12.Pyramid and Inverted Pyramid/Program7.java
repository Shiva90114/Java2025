import java.util.Scanner;
class Number2Multi {

	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number of Rows :");
	int num = sc.nextInt();
	int current =2;
	for(int i= 0;i<num;i++){
	     for(int j=0;j<i;j++){
	     System.out.print("   ");
	     }
	     int count = 2*(num -i)-1;
	     for(int s=0;s<count;s++){

	         
		 System.out.printf("%2d ",current);
		  current =current+2;// current+=2;
		 
	       }
         System.out.println();
	}
	sc.close();
	}

}
