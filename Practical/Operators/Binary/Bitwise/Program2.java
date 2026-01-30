// Bitwise Opertion 

class BitwiseOpertion {

	public static void main(String[] args) {
	
		System.out.println("Left SHift ");
		int z = 5;
		int res = z<<2;

		System.out.println(res);

	        System.out.println("Right SHift ");
                
		int a =20;
		res = a>>2;
                System.out.println(res);

		 
		System.out.println(" ^ ");
                boolean x = true;
                boolean y = true;

                System.out.println(x ^ y);

                 x = true;
                 y = false;

                System.out.println(x ^ y);

                 x = false;
                 y = true;

                System.out.println(x ^ y);

		 x = false;
                 y = false;

                System.out.println(x ^ y);
	}
}
