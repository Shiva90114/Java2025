// Code -10
// Constructor
// Access

public class Code10 {
	public int x =100;
	Code10(){
		System.out.println("Code10 Constructor");
	}
}
class DemoChild extends Code10 {

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
