import java.util.*;

class CenterTriangle {
 
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter Rows Number :");
	int rows = scanner.nextInt();

        char startChar = (char)('A'+rows - 1);  	
	for(int i=0;i< rows;i++){

	    	for(char ch = startChar;ch>=(char)(startChar - (rows - 1 -i));ch--){   
	       	     System.out.print(ch+" ");
		 
	     }
	
	System.out.println();
	}
	scanner.close();
	}






}
