
import java.util.*;

class Demo {
	public static void main(String[] args){
	
	 Scanner sc = new Scanner(System.in);
	System.out.println("Enter Your First Number :");
	int num1= sc.nextInt();
       
	System.out.println("Enter Your Second Number :");
	int num2=sc.nextInt();
	
	System.out.println("Enter Your Third Number :");
        int num3=sc.nextInt();
	if(num1*num1+num2*num2==num3*num3){
	System.out.println("It is a Pythagorean Triplet");
	} else {
	System.out.println("It is not a pythagorean triplet");
	}
        
	}	 
}
