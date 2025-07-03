import java.util.*;

class Student {
              public static void main(String[] args){
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter First Subject Mark : ");
	      int sub1 = sc.nextInt();
	      System.out.println("Enter Second Subject mark : ");
	      int sub2 = sc.nextInt();
	      System.out.println("Enter Third Subject Mark : ");
              int sub3 = sc.nextInt();
	      System.out.println("Enter Fourth Subject Mark : ");
              int sub4 = sc.nextInt();
	      System.out.println("Enter Fifth Subject Mark : ");
              int sub5 = sc.nextInt();
	      
	      int marks = sub1 + sub2 + sub3 + sub4 + sub5;

	      if(sub1 < 35 || sub2 < 35 || sub3 < 35 || sub4 < 35 || sub5 < 35){
                System.out.println("You are failed in Exam");
	     
	      }else {
		      double percentage = marks/5.0;
                     int grade = (int)percentage / 10;
		switch(grade) {
		               case 10 :
			       case 9 :
			       case 8 :
	                       case 7 :	       System.out.println("Grade: First Class with Distinction");
			       case 6 :  System.out.println("Grade: First Class");
             		       case 5 :  System.out.println("Grade: Second Class ");
			       case 4 :  System.out.println("Grade: Pass class");
			       

                               break;
                               default :  System.out.println("Grade: No Grade");  
		}     
	      
	      } sc.close();
	   } 

}
