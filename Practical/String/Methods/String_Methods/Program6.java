// Code - 6
// String  
// Tokenizer
import java.util.*;
class StringDemo {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter empName,cmpName,location : ");
		String info = sc.nextLine();
                System.out.println(info);
		StringTokenizer st = new StringTokenizer(info," ");

          	System.out.println("Employee Name : "+st.nextToken());
		System.out.println("Company Name : "+st.nextToken());
		System.out.println("Address : "+st.nextToken());
	}
}
