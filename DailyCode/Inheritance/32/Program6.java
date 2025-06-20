class Parent {
         Parent() {
	 System.out.println("In Parent Constructor");
	 }


}
class Child extends Parent {
    Child() {
         System.out.println("In Child Constructor");
         }
}
class Child1 extends Child {
    Child1() {
         System.out.println("In Child1 Constructor");                                                                          }
}
class Client {

public static void main(String[] args) {
            Child1 obj = new Child1();
}
}
