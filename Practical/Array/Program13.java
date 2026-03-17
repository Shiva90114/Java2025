// Array 
// Code - 13

class ArrayDemo {

	public static void main(String[] args) {
	
		int arr1[] = new int[]{10,20,30,40};
		Integer arr2[] = new Integer[]{10,20,30,40};
		System.out.println("Array :arr1 ");

		for(int i =0;i<arr1.length;i++){
		
			System.out.print(arr1[i]+" ");
		}
	        System.out.println();
		 System.out.println("Array :arr2 ");

                for(int i =0;i<arr2.length;i++){

                        System.out.print(arr2[i]+" ");
                }
                System.out.println();

		System.out.println(System.identityHashCode(arr1));
		System.out.println(System.identityHashCode(arr2));
		                   

	}

}
