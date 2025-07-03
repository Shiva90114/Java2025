import java.util.*;
class Number {
      public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter Number1 = ");
      int num1 = sc.nextInt();
      System.out.println("Enter Number2 = ");
      int num2 = sc.nextInt();
      if(num1 < 0 || num2 < 0){
      System.out.println("Sorry negative number are not allowed");
      } else {

      int num =num1*num2;
     
      System.out.println("Multiplication : "+ num);
      
      switch (num % 2){
	     case 0 : System.out.println(num+" is Even Number");
             break;

	     case 1 : System.out.println(num+" is Odd Number");
             break;
	     
	     default : System.out.println("Unexpected error");	      
      }
    

      
      }

}
}
