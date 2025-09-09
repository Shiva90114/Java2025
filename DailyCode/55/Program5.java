// Bounded
//
// BlockingQueue(I) -> Queue(I)
//

import java.util.concurrent.*;

class BlockingDemo {

	public static void main(String[] args) throws InterruptedException{
	
		BlockingQueue dq = new ArrayBlockingQueue(3);

		dq.put(10);
		dq.put(20);
		dq.put(30);
		System.out.println(dq);	
		dq.put(40);

		System.out.println(dq);

	}
}
