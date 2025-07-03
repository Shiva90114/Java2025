import java.util.*;

class Alphabet {

	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Number of Rows :");
	int num = sc.nextInt();
     
	for(int i = num; i>= 1;i--){
	 char ch =(char)('A'+i-1);
		for(int j= 1; j<=num;j++){
              System.out.print(ch+" ");

	
	}
	System.out.println();
	
	}
}
}
