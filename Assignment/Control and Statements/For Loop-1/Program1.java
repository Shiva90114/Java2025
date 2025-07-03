import java.util.*;

class Natural {

	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Number : ");
	int num = sc.nextInt();
        int i = 1; 
	for(i=1;i<=num;i++){
	 System.out.print(i);
	  if(i<num){
		  System.out.print(",");
	  }
	}
       	sc.close();
	}

}
