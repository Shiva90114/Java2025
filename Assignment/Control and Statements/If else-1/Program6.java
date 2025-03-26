import java.util.*;
class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number=");
		int num = sc.nextInt();
                if(num%3==0 && num%7==0){
                System.out.println(num+" is Divsible by 3 and 7");
                }
		else if(num%3==0){
		     System.out.println(num+" is Divisible by 3");
		}else
		if(num%7==0){
			System.out.println(num+" is Divisible by 7");
		}else
		{
		System.out.println(num+" is  neither Divisible by 3 nor by 7");	
		}
	}
}

