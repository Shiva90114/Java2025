abstract class Papa{   // abstract

	void getProperty(){
	System.out.println("Bunglow + Car");
	}
	abstract void marry();     // abstract
}
class Shiva extends Papa {

	void marry(){
	
		System.out.println("Kriti Sanon");
	}

}
class Demo {

	public static void main(String[] args){
	
		// Papa p = new Papa();   // error

		Shiva s = new Shiva();
		s.getProperty();
		s.marry();
		
		
		Papa p = new Shiva(); // abstract class refernce
                p.getProperty();
                p.marry();
	}
}
