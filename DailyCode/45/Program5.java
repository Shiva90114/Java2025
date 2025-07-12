// try-catch-finally
import java.util.*;

class Demo{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
                int y = sc.nextInt();
                try{
			System.out.println(x/y);
			
		}catch(NullPointerException obj){
			 System.out.println("Null Exception");
		}catch(ArithmeticException obj2) {
		
		        System.out.println("Arithmetic Exception");

		}finally{
			 System.out.println("In finally block");
			  System.out.println("Clean up code");
		}
	
	}
}
