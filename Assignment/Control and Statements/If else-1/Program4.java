import java.util.*;
class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Character=");
		char ch = sc.next().charAt(0);
                if(Character.isUpperCase(ch)){
		     System.out.println(ch+" is an Uppercase Letter");
		}else
		if(Character.isLowerCase(ch)){
			System.out.println(ch+" is LowerCase");
		}else{
		System.out.println(ch+" is not Letter");	
		}
	}
}

