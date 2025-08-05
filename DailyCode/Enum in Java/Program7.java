class Demo extends Exception {

	Demo(String str){
	
		super(str);
	}
}
class Parent  {

	Parent(){
	System.out.println("Parent Constructor");
	}
	Object m1(){
	
		System.out.println("Parent M1");
		return 10;
	}


}
class Child extends Parent {

	Child(){
	       	System.out.println("Child Constructor");
        }
        String m1(){

                System.out.println("Child M1");
		return new String();
        }
}
class Client {

	public static void main(String[] args){
	
		Parent p = new Child();
		p.m1();
	}
}
/*
 * double m1(){

 *error


 * Program7.java:26: error: m1() in Child cannot override m1() in Parent
        double m1(){
               ^
  return type double is not compatible with int
1 error

*/
