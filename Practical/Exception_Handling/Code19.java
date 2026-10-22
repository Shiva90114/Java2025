// Code -19
// Exception 
// UserDefine

class AgeException extends Exception{

	AgeException(String Msg) {
	
		super(Msg);
	}

}
class Demo {

	static void checkAge(int age)  throws AgeException {
	
		if(age<18) {
		
			throw new AgeException("Age is Less than 18");
		}
		System.out.println("You are eligible");
	}
	public static void main(String[] args) {
	
		try {
		
			checkAge(15);
		} catch (AgeException e) {
			System.out.println(e.getMessage());
		

		}
	}
}
