
import java.util.*;

class Demo {
	public static void main(String[] args){
	
	 Scanner sc = new Scanner(System.in);
	System.out.println("Enter Your Percentage :");
	float num1= sc.nextFloat();
	System.out.println("Suggest Your Field");
	if(num1>85.00){
	System.out.println(" Medical");
        }
	 else
 	if(num1>75.00 && num1<=85.00)	 
        {
        System.out.println("Enginnring");
        }
         else
        if(num1>65.00 && num1<=75.00)
	{
	System.out.println("Pharmacy or bachelor in science");
	}
	}
}
