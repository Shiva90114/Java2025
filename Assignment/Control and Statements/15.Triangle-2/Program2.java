import java.util.*;
class Triangle{

	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number : ");
	int num = sc.nextInt();
	
	for(int i=1;i<=num;i++){
                   int start = num-i+1;
		   int step =Math.max(num-i+1,1);
	         for(int j =1;j<=i;j++){
	          	      System.out.print(start+"   ");
		     start=start+step;     
		 }
	       System.out.println();
              if(step>1){
	      step--;
	      }
	sc.close();
	}
	}
}
