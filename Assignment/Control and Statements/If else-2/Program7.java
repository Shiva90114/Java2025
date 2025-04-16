
import java.util.*;

class Demo {
	public static void main(String[] args){
	
	 Scanner sc = new Scanner(System.in);
	System.out.println("Enter Your Cost Price :");
	int num1= sc.nextInt();
       
	System.out.println("Enter Your Selling Price");
	int num2=sc.nextInt();
	if(num1>num2){
	System.out.println("Loss of "+(num1-num2));
        }
	 else
 	if(num1<num2)	 
        {
        System.out.println("Profit of "+(num2-num1));
        }
         else
        if(num1==num2)
	{
	System.out.println("No Profit no Loss");
	}
	}
}
