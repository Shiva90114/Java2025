import java.util.*;
class Demo {
          public static void main(String[] args){
		  

	  Scanner scanner= new Scanner(System.in);
	  System.out.println("Traffic Light System");
          System.out.println("Enter Color(Red,Yellow,Green)");
	  String lightColor=scanner.nextLine().toLowerCase();
	  if(lightColor.equals("red")){
	  System.out.println("Stop!");
	  } else
	  if(lightColor.equals("yellow")) 
	  {System.out.println("Get ready!");
	     } else
          if(lightColor.equals("green")){
		  System.out.println("Go!");
	  }else{
	 System.out.println("Invalid Color ! Please Enter Red,Yellow,Green. ");

	 }		  
       scanner.close();
          
	  }
	  }
	  



