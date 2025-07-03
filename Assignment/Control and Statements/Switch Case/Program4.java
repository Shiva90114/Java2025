import java.util.*;
class Demo {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter Num1= ");
    double num1 = sc.nextDouble();

    System.out.println("Enter Num2= ");
    double num2 = sc.nextDouble();
   
    System.out.println("Enter Operation(+,-,*,/)= ");
    char operator = sc.next().charAt(0);

    switch (operator) {
    case '+' : System.out.println("Addition "+(num1 + num2));
    break;

    case '-' : System.out.println("Substraction "+(num1 - num2));
    break;

    case '*' : System.out.println("Multiplication "+(num1 * num2));	       
    break;    
    
    case '/' : System.out.println("Division "+(num1 / num2));	       
    
    break;
    default : System.out.println("Invalid Operation");	       
    
    }
    sc.close();
    }

} 
