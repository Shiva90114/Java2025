class Outer {
        int x = 10;
        static int y = 20;	
	class Inner {
	 
		void disp() {
		System.out.println(x);
		System.out.println(y);
		}


	 }

}
class Client {

	public static void main(String[] args){
	Outer outObj = new Outer();
	Outer.Inner obj = outObj.new Inner();
	obj.disp();
	}
}
