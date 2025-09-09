// Bounded
//
// BlockingQueue(I) -> Queue(I)
//

import java.util.concurrent.*;

class BlockingDemo {

	public static void main(String[] args) throws InterruptedException{
	
		BlockingQueue bq = new ArrayBlockingQueue(3);

		bq.put(10);
		bq.put(20);
		bq.put(30);
		System.out.println(bq);	
	         
		bq.take();

		bq.put(40);
                System.out.println(bq);

	}
}
