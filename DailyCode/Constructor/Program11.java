class Demo{
   static int x=10;
   static void fun(){
   System.out.println("In Fun");
   }
    public static void main(String[] args){
  System.out.println(x);
  fun();
    }
  /*}public static void main(String[] args){
  System.out.println(x);
  fun();
  }*/                // error

}

class Client {
public static void main(String[] args){
System.out.println(Demo.x);
fun();
}

}
