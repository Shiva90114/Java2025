class Demo{
   static int x=10;
  // public static void main(String[] args){
  // System.out.println(x);
  // System.out.println(Demo.x);                //10
   
   }

class Client{

         public static void main(String[] args){
	//  System.out.println(x);               error `cannot find Symbol
         System.out.println(Demo.x);  // error
	 }
}
