// Bounded
//
// PriorityBlockingQueue(I) -> Queue(I)
//

import java.util.concurrent.*;

class BlockingDemo {

	public static void main(String[] args) throws InterruptedException{
	
		BlockingQueue bq = new PriorityBlockingQueue();
		// BlockingQueue bq = new LinkedBlockingQueue(4);  // no any change (4)

		bq.put(40);
		bq.put(20);
		bq.put(10);
		bq.put(30);
		System.out.println(bq);	
	         
		while(!bq.isEmpty()){

                          System.out.println(bq.take());

		}

	}
}
