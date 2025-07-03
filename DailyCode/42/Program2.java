// 42 // InnnerClasses
class Outer { 
       	class Inner1  {
	 
		void dispInner() {
		System.out.println("In Inner method");
		}
	   
	    	class Inner2{
	               void dispInner2() {
                                     System.out.println("In Inner 2 method");
	               }	
	 
		}	 }
	 void dispOuter() {
                System.out.println("In Outer method");
                }
}
class Client {

	public static void main(String[] args){
	
	    
	       Outer outObj1 = new Outer();
		Outer.Inner1 innObj1 = outObj1.new Inner1();

                Outer.Inner1.Inner2 innObj2 = innObj1.new Inner2();
		innObj2.dispInner2();
	         //  new Outer().new Inner1().new Inner2().dispInner2();	
	}
}
