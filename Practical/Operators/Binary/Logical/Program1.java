// Logical Opertion

class Logical {

	public static void main(String[] args) {
	
		int x =8;
		int y = 7;
                boolean result = true && true; 
		System.out.println("true && true = "+result);
		 result = true && false;
                System.out.println("true && false ="+result);
		 result = false && false;
                System.out.println("false && false ="+result);

		result = true || true;
                System.out.println("true || true = "+result);
                 result = true || false;
                System.out.println("true || false ="+result);
                 result = false || false;
                System.out.println("false || false ="+result);
	}
}
