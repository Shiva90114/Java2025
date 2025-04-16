import java.util.*;
class Demo {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Your Size From :");
    String  size = sc.next();
    if(size=='s'){
    System.out.println("small");
    } else  if(size=='m'){
    System.out.println("Medium");
    }else  if(size=='l'){
    System.out.println("Large");
    }else  if(size=="xl"){
    System.out.println("Extra large");

    }
    
    else {
    System.out.println("Invalid Grade");
    }
    }


}
