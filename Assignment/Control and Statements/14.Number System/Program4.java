import java.util.*;
class Factorial {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
        
	System.out.print("Enter Number: ");
	int num = sc.nextInt();

	if(num<0){
	System.out.print("Factorial is not defined for number  ");
	return;
	}
	long count =1;
	
	for(int i=1;i<=num;i++){
	    if(num%i==0){
	     count *=i;
	    }
	}
	System.out.println("Factorial of "+num+" is:"+count);


	
	}

}
