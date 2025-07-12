import java.util.*;

class Demo {

	static void run(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Values");
	int x = sc.nextInt();
	int y = sc.nextInt();
	try {
		System.out.println(x/y);
	}catch(ArithmeticException ae) {
	        System.out.println("Zero Enter karu Nako");
		y = sc.nextInt();
	//	System.out.println(x/y);
	}}
	static void fun() {
	System.out.println("In fun");
	run();
	}

        public static void main(String[] args){
        fun();
	System.out.println("End Code");


}
}


