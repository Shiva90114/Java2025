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
	System.out.println("Digits of "+num+"  are:");
	
	int temp =num;
	while(temp>0){
	     int digit = temp%10;
	     System.out.print(digit+" ");
	     temp/=10;
	}

	
	}

}
