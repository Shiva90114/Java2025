class Demo{
   
	static int x=10;
	static {
	System.out.println("In Static block");
	}
	static void fun() {
	
	        System.out.println("In static metod: fun");
	}
	
	public static void main(String[] args){
	
	        System.out.println(x);
		fun();
		
	}




}
