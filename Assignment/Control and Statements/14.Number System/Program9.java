import java.util.*;
class Digit {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
        
	System.out.print("Enter Number: ");
	int num = sc.nextInt();

	if(num<0){
	System.out.print("Please Enter Postive number  ");
	return;
	}
	
        int reversed =0;	
	while(num!=0){
	     int digit = num%10;
	     reversed = reversed*10+digit;
	     num /=10;
	}
         
	System.out.println("Reversed number is "+reversed);
        	}

}
