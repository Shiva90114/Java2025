// Bounded
//
//
//
// ********************************************** // Producer Consumer Problem //********************************************
//
//  
//

import java.util.concurrent.*;

class Producer implements Runnable{

	BlockingQueue blockQueue;

	Producer(BlockingQueue blockQueue){
	
		this.blockQueue = blockQueue;
	}
	public void run(){
	
		try{
		
			for(int i=1;i<=5;i++){
			
				blockQueue.put(i);
				System.out.println("Producer produced : "+i);

				Thread.sleep(1000);
			}
		}catch(InterruptedException ie){
		
		}
	}
}

class Consumer implements Runnable{

	BlockingQueue blockQueue;

        Consumer(BlockingQueue blockQueue){

                this.blockQueue = blockQueue;
        }
	public void run(){

		try{
			for(int i=1;i<=5;i++){

				System.out.println("Consumer consumed : "+blockQueue.take());
                 
				Thread.sleep(5000);
				//Thread.sleep(10000);

		 	}

                }catch(InterruptedException ie){

                }
        }
}
class ProducerConsumer {

	public static void main(String[] args) throws InterruptedException{
	
	
		BlockingQueue bq = new ArrayBlockingQueue(2);
		//BlockingQueue bq = new ArrayBlockingQueue(3);
                 
		Producer obj1 = new Producer(bq);
		Consumer obj2 = new Consumer(bq);

		Thread producer = new Thread(obj1);
		Thread consumer = new Thread(obj2);

		producer.start();
		consumer.start();

		

	}
} 
