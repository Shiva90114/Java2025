// Code -3
//InnerClass
//Method Local Inner Class

class Outer{

        void dispOuter() {
                   System.out.println("Outer-Disp");
	}
	class Inner{
	
		void dispInner(){
		
			System.out.println("Inner - Disp");
		}
		Inner obj = new Inner();
		obj.dispInner();
	        }

	public static void main(String[] args){
	
		Outer out = new Outer();
		out.dispOuter();
		
	}
}

