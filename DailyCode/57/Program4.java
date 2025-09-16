

import java.util.*;

class HeapDemo{

	public static void main(String[] args){
	
		List ll = new ArrayList();
		for(int i =1;i<=1000000;i++){
		
			String str = new String("Shiva "+i);
			ll.add(str);
			if(i%2000==0){
			
				System.out.println("Object Created "+i);

			}

		}
		System.out.println("Finsh");
	}

}
