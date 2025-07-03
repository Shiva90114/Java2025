// 42 // InnnerClasses
class Outer {
         class Inner  {
	 
		void dispInner() {
		System.out.println("In Inner method");
		} 
	 
	 }
	 void dispOuter() {
                System.out.println("In Outer method");
                }
}
class Client {

	public static void main(String[] args){
	
	      //Outer obj = new Outer();
	      //obj.dispOuter();
	        Outer outObj1 = new Outer();
		Outer.Inner obj1 = outObj1.new Inner();
              	obj1.dispInner();  
	        
	        Outer outobj2 = new Outer();
		Outer.Inner obj2 = outobj2.new Inner();
	        obj2.dispInner();	
                
	        Outer.Inner obj3 = outObj1.new Inner();
	        obj3.dispInner();	
	}
}
