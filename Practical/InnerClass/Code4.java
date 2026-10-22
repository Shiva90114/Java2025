// Code -4
//InnerClass
//Static Nested Inner Class

class Outer{

	// int y =20; //error: non-static variable y cannot be referenced from a static context
                        //                 System.out.println(y);
	static int x =20;
        
	static class Inner{//Static Nested Inner Class
	
		void show(){
		
			System.out.println(x);
			// System.out.println(y);
		}
		
	}
}
class Client {

	public static void main(String[] args){
	
		//for normal case
		//Outer obj = new Outer();
		//Outer.Inner i = o.new Inner();
		
		Outer.Inner i = new Outer.Inner(); // no object required
		i.show();
	}
}

