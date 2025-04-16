import java.util.*;
class Demo {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Your Grade :");
    char grade = sc.next().charAt(0);
    if(grade=='a'){
    System.out.println("Excellent");
    } else  if(grade=='o'){
    System.out.println("Outstanding");
    }else  if(grade=='b'){
    System.out.println("Best");
    }else  if(grade=='c'){
    System.out.println("Good");

    }
    else  if(grade=='f'){
    System.out.println("Fail");
 
    }
    else {
    System.out.println("Invalid Grade");
    }
    }


}
