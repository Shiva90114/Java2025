// Interface   Multiple Inheritance

interface AInter {
          
          
	  public default void run(){
	  System.out.println("In run A");
	  }

}
interface BInter {

       	void run();
	
}
class Demo implements AInter,BInter {
           public  void run(){
          System.out.println("In run A");
          }	
	
	
}
class Client {
     public static void main(String[] args){
     
	     Demo obj = new Demo();
	     obj.fun();
	     //obj.run();
     }
    
     
     
}
