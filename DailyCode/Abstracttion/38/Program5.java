//
//                Interface         
//

interface InterDemo {
                   public abstract void fun();
		   void run();   // 
			   

}
class Demo implements InterDemo{
             public    void fun(){
	    System.out.println("In Fun-Demo");
	    }
	   public  void run(){
            System.out.println("In Run-Demo");
            }

}
class Client {
public static void main(String[] args){
                      InterDemo obj = new Demo();                                       //Demo obj = new Demo();  not error
           obj.fun();
	   obj.run();
         
    }

    


}
