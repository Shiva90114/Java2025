// Methods - Instance Static

class Demo {

	int x = 10;
	static int y = 20;

	void disp() {
	
		System.out.println(x);
		System.out.println(y);
	}
	static void info() {
	
		System.out.println(y);
	}

}
class Client {
         public static void main(String[] args){
	      Demo.info();

	      Demo obj = new Demo();
	      obj.disp();


	 }
 }

//20
//10
//20
