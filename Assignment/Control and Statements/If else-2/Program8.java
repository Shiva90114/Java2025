
import java.util.*;

class Demo {
	public static void main(String[] args){
	
	 Scanner sc = new Scanner(System.in);
	System.out.println("Enter Your Percentage :");
	float num1= sc.nextFloat();
	
	if(num1>=75.00){
	System.out.println(" Passed : First class with distinction");
        }
	 else
 	if(num1>=60.00 && num1<75.00)	 
        {
        System.out.println("Passed ; First Class");
        }
	     else
        if(num1>=50.00 && num1<60.00)
        {
        System.out.println("Passed ; First Second Class");
        }
         else
        if(num1>=35.00 && num1<50.00)
	{
	System.out.println("Pass");
	}
	}
}
