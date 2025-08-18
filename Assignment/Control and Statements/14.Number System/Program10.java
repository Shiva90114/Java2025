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
	int num1=num;
        int reversed =0;	
	while(num!=0){
	     int digit = num%10;
	     reversed = reversed*10+digit;
	     num /=10;
	}
	 // read the same foewords and backword
	if(num1==reversed){
	
		System.out.println(num1+" is a palindrome number");
	}
	else if(num!=reversed){
	

                System.out.println(num1+" is Not palindrome number");
        }
        // read the same foewords and backword 
	}

}
