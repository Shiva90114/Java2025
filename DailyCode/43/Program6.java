//Abstract in Anonymous Inner Class

abstract class Demo {
        abstract void fun();
}
class Client {

	public static void main(String[] args){
	Demo obj = new Demo(){
	  void fun() {
	  
	  }
	};

	obj.fun();
	}
}
