class Demo{
          static void fun(){
	  System.out.println("In fun");
	  
	  }
}
class DemoChild extends Demo{

}
class Client {
       public static void main(String[] args){
              DemoChild.fun();
	      //
	      //or
	      //
	      //DemoChild obj = new DemoChild();
	      //obj.fun();
	      //
       
       }

}
