// Method Local Inner Class
class Outer {

	
	void dispOuter1() {
                     System.out.println("Outer-disp");	
		class Inner {
			void dispInner() {
				System.out.println("Inner-disp");
			}
		}
	}
	void dispOuter2() {                                                                                                                             System.out.println("Outer-disp");
                class Inner {
                        void dispInner() {                                                                                                                        System.out.println("Inner-disp");                                                                                    }     
                	}       
                Inner obj = new Inner();
                obj.dispInner();
	}
}
class Client {
             public static void main(String[] args){
	             Outer obj = new Outer();
		     obj.dispOuter2();

	     }
}

// javc Program1.java
