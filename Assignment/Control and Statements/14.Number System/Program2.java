import java.util.*;
class Factor {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
        
	System.out.print("Enter Number: ");
	int num = sc.nextInt();

	if(num<=0){
	System.out.print("Please Enter  Positive or Zero ");
	}
	int count =0;
	for(int i=1;i<=num;i++){
	    if(num%i==0){
	    System.out.print(i+" ");
	    count++;
	    }
	}
	System.out.println();
	if(count==2){
	System.out.println(num+" is Prime Number");
	
	}else{
        System.out.println(num+" is Not Prime Number");

        }


	
	}

}
