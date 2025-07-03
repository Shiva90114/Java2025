import java.util.*;

class Alphabet {

	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Number of Rows :");
	int rows = sc.nextInt();
        
	for(int i =1; i<=rows;i++){
		char ch= 'A';
		int num=1;
	for(int j = 1;j<=rows;j++){
	   

	            System.out.print(num+""+ch+"  ");
		    ch++;
		    num++;
	            	        
	}
	System.out.println();
	}
	            
	    sc.close();
	
	}


}
