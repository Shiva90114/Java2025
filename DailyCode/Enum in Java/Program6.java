class Demo extends Exception {

	Demo(String str){
	
		super(str);
	}
}
class Parent  {

	Parent(){
	System.out.println("Parent Constructor");
	}
	void m1(){
	
		System.out.println("Parent M1");
	}


}
class Child extends Parent {

	Child(){
	       	System.out.println("Child Constructor");
        }
        void m1(){

                System.out.println("Child M1");
        }
}
class Client {

	public static void main(String[] args){
	
		Parent p = new Child();
		p.m1();
	}
}
