// Code -9 
// Constructor
// Access
public class Code9 {

	int x =10;
	Code9(){
	
		System.out.println("Code9 Constructor");
	}
}
class DemoChild extends Code9 {

        DemoChild(){

                System.out.println("DemoChild Constructor");
		System.out.println(x);
        }
}
class Client {

	public static void main(String[] args) {
	
		DemoChild obj = new DemoChild();

	}
}
