// Array - Double DataType
class ArrayDemo {

    public static void main(String[] args) {
 
	    char arr1[] = new char[]{'A','B','C','D'};
	    int arr2[] = new int[]{10,20,30,40,50};
	    System.out.println(arr1);    // ABCD
	    System.out.println(arr2);  //  [I@4aa298b7
            
	    System.out.println(System.identityHashCode(arr1));// 2101973421
	    System.out.println(System.identityHashCode(arr2));// 1252169911
	   }
}

