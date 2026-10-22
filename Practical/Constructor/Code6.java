// Code -6 Constructor
// Multiple parent not allow in Java

class Parent1 {

	Parent1(){
	
		System.out.println("Parent1 Constructor");
	}
}
class Parent2 {

        Parent2(){

                System.out.println("Parent2 Constructor");
        }
}
class Child1 extends Parent1,Parent2 {// error

        Child1(){

                System.out.println("Child1 Constructor");
        }
}
class Client {

	public static void main(String[] args) {
	
		Child1 obj = new Child1();

	}
}
