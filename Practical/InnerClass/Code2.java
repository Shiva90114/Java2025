// Code -2
//InnerClass
//

class Outer{

	int x =30;
	static int y=10;
	class Inner{
	
		int x =40;
		final static int y =20;
		void disp(){
		
			System.out.println(Outer.y);
			System.out.println(Outer.this.x);
		}
	}
}
class Client{

	public static void main(String[] args){
	
		Outer obj = new Outer();
		Outer.Inner in = obj.new Inner();
		in.disp();
	}
}

