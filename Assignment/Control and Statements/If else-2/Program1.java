
import java.util.*;

class Demo {
	public static void main(String[] args){
	
	 Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number :");
	 int num1= sc.nextInt();
	if(0<num1 && num1<=1000){
	System.out.println(num1+" is in the Range 1 to 1000");
        }
         else
	{
	System.out.println(num1+" is not in the range 1 to 1000");
	}
	}
}
