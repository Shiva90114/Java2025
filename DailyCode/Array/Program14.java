// Array - Double DataType
class ArrayDemo {

    public static void main(String[] args) {
 
	    int x=10;
	    Integer y =10;
	    int z=10;
	    
	    System.out.println(System.identityHashCode(x));  // 1252169911
	    System.out.println(System.identityHashCode(y));  // 1252169911
	    System.out.println(System.identityHashCode(z));   // 1252169911
	   }
}

