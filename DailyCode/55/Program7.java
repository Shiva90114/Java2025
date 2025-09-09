// Bounded
//
// LinkedBlockingQueue(I) -> Queue(I)
//

import java.util.concurrent.*;

class BlockingDemo {

	public static void main(String[] args) throws InterruptedException{
	
		BlockingQueue bq = new LinkedBlockingQueue(4);
		// BlockingQueue bq = new LinkedBlockingQueue();

		bq.put(10);
		bq.put(20);
		bq.put(30);
		bq.put(40);
		System.out.println(bq);	
	         
		bq.take();

		bq.put(50);
                System.out.println(bq);

	}
}
