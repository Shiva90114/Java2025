import java.util.*;
class Plan {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Movies Plan Subscription");
    System.out.println("1. Platinum");
    System.out.println("2. Gold");
    System.out.println("3. Silver");
    System.out.println("4.Bronze");
    System.out.println("5.free");
    System.out.println("Enter Your Plan :");
    String plan = sc.next().toLowerCase();

    switch (plan) {
	    case "platinum" : System.out.println("For the Platinum Plan, the price is 799 ");
            break;
            
            case "gold" : System.out.println("For Gold plan , the price is 599");
            break;

            case "silver" : System.out.println("For the Silver Plan, the price is 399 ");
            break;

	    case "bronze" : System.out.println("For the Bronze Plan, the price is 199");
            break;

            case "free" : System.out.println("For less than 199, the platform is free with Limitted access");
            
            break;		   
    	    default : System.out.println("Invalid Input");	       
    
    }
    sc.close();
    }

} 
