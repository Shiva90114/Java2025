
import java.util.*;

class Demo {
	public static void main(String[] args){
	
	 Scanner sc = new Scanner(System.in);

	System.out.println("Enter Your Total purchase amount : $");
	double totalPurchase= sc.nextDouble();
       
	
	if(totalPurchase>100){
        double discount =totalPurchase*0.10;
	double finalAmount=totalPurchase-discount;
	System.out.println("You gate Discount a 10% Discount! ");
        System.out.println("Discounted Amount=  $"+discount);
	System.out.println("Total to pay : $"+finalAmount);	
	}
	 else
        {
        System.out.println("No Discount. Spend more than $100 to get a 10% discount.");
	System.out.println("Total to Pay:  $"+totalPurchase);
	}
	}
}
