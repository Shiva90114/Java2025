// Static Nested  Class
class Outer {
        static int x = 10;
	static class Inner {
                        
		void disp() {                                                                                                                        System.out.println("In -disp");
                                System.out.println(x);
		}     
                	} 
}	
    
class Client { 
	public static void main(String[] args){

	             Outer.Inner obj = new Outer.Inner();
		     obj.disp();

	     }
}


