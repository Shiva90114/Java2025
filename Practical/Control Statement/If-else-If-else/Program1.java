// If-else-If-else

class IfelseIf{

	public static void main(String[] args) {
	
		int x =10;
		int y =20;
		int z =30;

		if(x>y) {
		
			if(x>z) {
			
				System.out.println(x+" is Greater Number");
			}else{
			
				System.out.println(z+" is Greater Number");
			}

		} else if(y>z) {
		
		
			System.out.println(y+" is Greater Number");
		} else {
		
			System.out.println(z+" is Greater Number");
		}
	}
}
