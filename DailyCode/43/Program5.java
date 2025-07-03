// Anonymous Inner Class
class Parent {

	void fun() {
	System.out.println("Parent - fun");
	}
}

class Client {
        public static void main(String[] args){
	        // Overridding
		Parent obj1 = new Parent(){
	        // Parent obj1 = new Child()  // Client$1 
	                 void fun() {
	                        System.out.println("Client$1 - fun");
	                 }
	                 };	   
/*
	      new Parent() {

	      }.fun();
 */	      
	    obj1.fun();

	   Parent obj2 = new Parent(){
	   };
	   obj2.fun();

	}
}
