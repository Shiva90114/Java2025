// Code -5
// Constrcutor

class Parent {

	int x =10;
	Parent(){
	
		
		//super(); // Automatic
		System.out.println("Parent Constrcutor");

	}
	void displayParent() {
	
		System.out.println(x);
	}
}
class Child extends Parent {

	Child(){
	
		System.out.println("Child Constructor");
	}
	void displayChild() {
	
		System.out.println(x);
	}
}
class Client {

	public static void main(String[] args) {
	
	
		Parent parentObj =new Parent();
		parentObj.displayParent();

		Child childObj=new Child();
		childObj.displayChild();
		childObj.displayParent();
	}
}
