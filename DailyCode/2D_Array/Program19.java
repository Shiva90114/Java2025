// 2D Array
// Program - 19

class ArrayDemo{

	public static void main(String[] args){
	
		Integer arr[][] = {{10,20,30},{10,20,30},{10,20,30}};

	
		System.out.println(System.identityHashCode(arr[0][0])); // 1252169911
           	System.out.println(System.identityHashCode(arr[1][0])); // 1252169911
                }
}
