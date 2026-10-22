// Code -16
// Exception Handling
//Run time Exception
//NumberFormateException


class Demo {


	public static void main(String[] args) {
	
		String str ="abc";
		try {
		int num= Integer.parseInt(str);                              
		System.out.println(num);
		}					   
		catch(NumberFormatException e){
		
			System.out.println("Invalid Number Formate");
		}
         }
}
