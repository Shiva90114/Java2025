import java.util.*;

class InvertedTriangle {

	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter Number of Rows : ");
	int num = scanner.nextInt();

        for(int i=1;i<=num;i++){
		for(int j=i;j<=num;j++){
            
			System.out.print(j+" ");

		
		}
		System.out.println();
	
	
	}
	
	scanner.close();
	} 
}
