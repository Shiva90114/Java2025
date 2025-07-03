// Constructor


class Demo {
       int x =10;
       Demo() {
       
	       //  not super()
	       this(20);
	       System.out.println("No argument Constructor");
       
       }
       Demo(int x){
       
	       //super()
	       this.x = x;
	       System.out.println("Parameterized Constructor");

       }
       void disp() {
       
	       System.out.println(x);
               }

}
class Client {

	public static void main(String[] args){
	
		Demo obj1 = new Demo();
		Demo obj2 = new Demo(50);

		obj1.disp();
		obj2.disp();
	}
}
// No argument Constructor
// Parameterized Constructor
// 10
// 50
