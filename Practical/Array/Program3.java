// Array
// code -3
import java.util.Arrays;
class ArrayDemo {

	public static void main(String[] args) {
	
		int arr1[] = {10,20,30,40,50};
		
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);

		arr1[0] = 50;
		System.out.println(arr1[0]);
		System.out.println("Print All Array :");
		System.out.println(Arrays.toString(arr1));
	}
}
