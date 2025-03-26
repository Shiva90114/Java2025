import java.util.*;
class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number=");
		int num1 = sc.nextInt();
		System.out.println("Enter Second number=");
		int num2 = sc.nextInt();
                if(num1>num2){
		     System.out.println(num1+" is  maximum Number Between"+num1+" and "+num2);
		}else
		if(num1<num2)	
		{
			System.out.println(num2+"  is maximum Number Between "+num1+" and "+num2);
		}
		else{
		    System.out.println(num1+" and "+num2+" is Equal number");
		}

	}
}

