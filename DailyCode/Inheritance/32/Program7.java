//Multiple Inheritance 
 class Parent1 {
         Parent1() {
	 System.out.println("In Parent1 Constructor");
	 }


}
 class Parent2 {
         Parent2() {
         System.out.println("In Parent2 Constructor");
         }


}
class Child extends Parent1,Parent2 {           //error only one class
    Child() {
         System.out.println("In Child Constructor");
         }
}

class Client {

public static void main(String[] args) {
            Child1 obj = new Child1();
}
}

