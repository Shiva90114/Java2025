

import java.util.*;

class HeapDemo{

	public static void main(String[] args){
	
		List ll = new ArrayList();
		for(int i =1;i<=100000;i++){
		
			//String str = new String("Shiva "+i);
			byte[] arr = new byte[1024*1024];   // 1MB

			ll.add(arr);
			if(i%20==0){
			
				System.out.println("Object Created "+i);

			}

		}
		System.out.println("Finsh");
	}

}
/*
 *erroe

 Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
        at HeapDemo.main(Program5.java:13)

 * */
