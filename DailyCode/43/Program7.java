//Lambda Function  1.8
//interface & Abstraction
interface Demo {
	abstract void fun();
}
class Client {

	public static void main(String[] args){
	        Demo obj = new Demo(){
 
    	            public void fun() {
	                                       System.out.println("In fun");
	  }
	};

	obj.fun();
	}
}
