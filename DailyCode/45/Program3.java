import java.util.*;

class Input{

	static void input(){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Player Name");
		String pName = sc.next();

		System.out.println("Enter Player Jersey No.");
                int jerNo = sc.nextInt();

		System.out.println("Enter index");

		int index =-1;
		try{
		         index = sc.nextInt();
		}catch(InputMismatchException obj){
			System.out.println("Please enter valid index");
			sc.next();
			index = sc.nextInt();
		
		}
		try{
		          System.out.println(pName.charAt(index));
		}catch(ArrayIndexOutOfBoundsException obj){
			System.out.println("Handling Code1");
		}catch(StringIndexOutOfBoundsException obj){
			System.out.println("Handling Code2");
		
		}
	}
	
	public static void main(String[] args){
	
		System.out.println("Start Main");
		input();
		System.out.println("End Main");
	}
}
