class ArrayDemo {

    public static void main(String[] args) {
 
	    int arr1[] = new int[]{10,20,30,40,50};
	    Integer arr2[] = new Integer[]{10,20,30,40,50};
	    System.out.println("Array 1");
	    for(int i =0;i<arr1.length;i++){
	    System.out.println(arr1[i]);
	    }
	    System.out.println("Array 2");                                                                                                                              for(int i =0;i<arr2.length;i++){
            System.out.println(arr2[i]);                                                                                                                                 }
            System.out.println(System.identityHashCode(arr1[2])); // HashCode
	    System.out.println(System.identityHashCode(arr2[2])); // HashCode
    }
}
