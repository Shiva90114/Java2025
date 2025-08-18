import java.util.*;
class Factor {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
        
	System.out.print("Enter Number: ");
	int num = sc.nextInt();

	if(num<=0){
	System.out.print("Please Enter  Positive or Zero ");
	}
      
	for(int i=1;i<=num;i++){
	    if(num%i==0){
	    System.out.println(i+" ");
	    }
	   
	}

	
	}

}
