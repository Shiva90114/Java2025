import java.util.*;
class Triangle{

	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number : ");
	int num = sc.nextInt();
	boolean cond = true;
	for(int i=1;i<=num;i++){
               if(i%2==0){

	       	for(int j =i;j>=1;j--){
			char ch =(char)('A'+j-1);

	          	      System.out.print(ch+"   ");
		}
		 }else{
		 if(cond){
                for(int j =1;j<=i;j++){
                        

                              System.out.print(j+"   ");
		}}else{
			for(int j =i;j>=1;j--){


                              System.out.print(j+"   ");
                }
		 }
		 cond=!cond;
		 }
	       System.out.println();
	}
	sc.close();
	}
}

