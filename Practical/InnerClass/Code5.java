// Code -5
//InnerClass
//Anonymous Inner Class

class Parent {

	void fun() {
	
		System.out.println("Parent Fun");
	} 
	
}
class Client {

	public static void main(String[] args){
	
		Parent obj1 = new Parent(){};// Anonymus Inner Class Name-'Client$1.class' 
		
		Parent obj2 = new Parent(){};//Anonymus Inner Class Name-'Client$2.class' 
	}
}

