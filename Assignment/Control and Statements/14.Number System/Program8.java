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
	
	int temp =num;
	int sum=0;
	while(temp>0){
	     int digit = temp%10;
	     if(digit% 2==0){
		   System.out.print(digit+" ");
	     }
	     if(digit%2==1){
	     
		     System.out.print(digit*digit+" ");
	     }
		     sum=sum+digit;
	   
	     temp/=10;
	}
         
        	}

}
