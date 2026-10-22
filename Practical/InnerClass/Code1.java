// Code -1
//Noraml inner Class
//

class Outer{

	class Inner{
		int x =10;
		
		 final static int y =20;
       }
}
class Client {

	public static void main(String[] args) {
	
		Outer obj = new Outer();
		Outer.Inner in = obj.new Inner();
		System.out.println(in.y);
	}
}
