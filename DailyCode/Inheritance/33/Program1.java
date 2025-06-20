// Private
class Demo{
          private int x = 10;
	  Demo(){
	  
	  System.out.println("Demo Constructor");
	   System.out.println(x);
	  }
   
}
class DemoChild extends Demo {


	   DemoChild() {

          System.out.println("DemoChild Constructor");
           System.out.println(x);
          }
}
class Client {
 public static void main(String[] args){
 
 DemoChild obj = new DemoChild();

 }

}
