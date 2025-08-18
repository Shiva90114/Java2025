import java.util.*;
class Triangle{

	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number : ");
	int num = sc.nextInt();
	
	for(int i=1;i<=num;i++){
               if(i%2==0){

	       	for(int j =0;j<i;j++){
			char ch =(char)('A'+j);

	          	      System.out.print(ch+"   ");
		}
		 }else{
		 
                for(int j =0;j<i;j++){
                        

                              System.out.print((j+1)+"   ");
                }
		 }
	       System.out.println();
            }
	sc.close();
	}
}

