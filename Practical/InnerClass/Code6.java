// Code -6
//InnerClass
//Anonymous Inner Class

class Animal {

	void sound() {
	
		System.out.println("Animal Sound");
	}
}
/*  Normal InnerClass
 *
class Dog extends Animal {

	@Override
	void sound() {
	
		System.out.println("Bark");
	}
}
*/
class Main {
	public static void main(String[] args){
	
		Animal a = new Animal(){
	
			@Override
			void sound() {

                         System.out.println("Bark");
                        }
		};
	        a.sound();	
	}
}

