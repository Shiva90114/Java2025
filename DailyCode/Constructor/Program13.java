class Demo{
   static int x=10;
   static void fun(){
   System.out.println("In Fun");
   }
 }
class Client{

  public static void main(String[] args){
  //  System.out.println(x);             can not find symbol
  // fun();                        can not find symbol
    Demo obj = new Demo();
	  System.out.println(obj.x);
            obj.fun();
  }               

}
