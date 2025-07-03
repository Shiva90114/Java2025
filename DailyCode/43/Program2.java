// Method Local Inner Class
class Outer {

	void dispOuter() {                                                                                                                             System.out.println("Outer-disp");
                class Inner {
                        void dispInner() {                                                                                                                        System.out.println("Inner-disp");                                                                                    }     
                	}       
                Inner obj = new Inner();
                obj.dispInner();
	}
             public static void main(String[] args){
	             Outer obj = new Outer();
		     obj.dispOuter();

	     }
}


