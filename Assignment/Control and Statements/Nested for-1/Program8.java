import java.util.*;

class Alphabet {

	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Number of Rows :");
	int num = sc.nextInt();
        char ch='A';
	for(int i = 0;i < num;i++){
	   for(int j = 0;j< num;j++){

	            System.out.print(ch +" ");
		    ch++;    
	   }
	            System.out.println(" ");   

	} sc.close();
	
	}


}
