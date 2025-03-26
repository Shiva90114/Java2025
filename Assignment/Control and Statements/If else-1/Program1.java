import java.util.*;
class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number=");
		int num = sc.nextInt();
                if(num>0){
		     System.out.println(num+" is Postive");
		}else
		if(num<0){
			System.out.println(num+" is Negative");
		}else{
		System.out.println(num+" is Zero");	
		}
	}
}

