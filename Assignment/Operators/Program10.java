class Opertor {
	public static void main(String[] args){
	
	// Arithmetic Opertor	
	int a=10;
	int b=5;
	System.out.println("Arithmetic Opertor:");

	 System.out.println("Adddition:"+(a+b));
	  System.out.println("Subtraction:"+(a-b));
	  System.out.println("Multiplication:"+(a*b));
	  System.out.println("Division:"+(a/b));
	  System.out.println("Modulus:"+(a%b));
	      
	  System.out.println("\nRelational Opertor:");
	   System.out.println("a>b :"+(a>b));
	   System.out.println("a<b :"+(a<b));
           System.out.println("a==b :"+(a==b));
           System.out.println("a!=b :"+(a!=b));
	
         // Bitwise Opertor

	 int c=12;
         int d=4;	 
         System.out.println("\nBitwise Opertor");		  
          System.out.println("12 & 4 : "+(12 & 4));
	  System.out.println("12|4 : "+(12 | 4));
	  System.out.println("12^4 :"+(12 ^ 4));
	  System.out.println("12>>4 :"+(12>>4));
	  System.out.println("12<<4 ; "+(12<<4));
	  


	  // logical Opertor
           boolean p=true, q=false;
	   System.out.println("\nLogical Opertor :");
           System.out.println("Logical AND (True&&False) : "+(p && q));
	   System.out.println("Logical OR (True || False) : "+(p || q));
	   System.out.println("Logical NOT (!True) : "+(!p));
           

	   //Assignment Opertor
	   int num=7;
	   System.out.println("\nAssignment :");
	    num+=4;
	   System.out.println("num+=5"+num);
	   num*=5;
	   System.out.println("num*=7"+num);



	}
}
