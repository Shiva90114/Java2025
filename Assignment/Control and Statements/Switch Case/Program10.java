import java.util.*;

class Plan {

	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter Your Moblie Plan Amount : ");
         int plan = sc.nextInt();

	 switch(plan) {
	 
		 case 100 : System.out.println("5GB for 90 Days");
		 break;
		 
		 case 199 : System.out.println("1GB/day for 14 Days");
		 break;
		 
		 case 399 : System.out.println("1.5GB/day for 28 Days");
		 break;
		 
		 case 499 : System.out.println("2GB/day for 56 Days");
		 break;
		 
		 case 859 : System.out.println("2GB/day for 84 Days");
		 
                 break;
	         default : System.out.println("Invalid Recharge Amount");
                 
	 }

	sc.close();
	}

}
