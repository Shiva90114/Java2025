// Multiple Inheritance in Interface

/*class Parent1{

}
class Parent2 {


}
class Demo extends Parent1,Parent2{
// error double parent
}
*/
interface Parent1 {
       default  void fun(){
	System.out.println("In default - Parent1");
	}
}
interface Parent2 {
         static  void fun(){
        System.out.println("In default - Parent2");                                                             }
}

class Demo implements Parent1,Parent2 {

}
class Client {
          public static void main(String[] args){
	  
		  Demo obj = new Demo();
		  obj.fun();	  
	  }
  
}
