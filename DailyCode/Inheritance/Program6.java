class Demo{
        Demo(){
	System.out.println("No-arg constructor");

	}
	    Demo(int x){
        System.out.println("One - Para constructor");

        }    Demo(int x,int y){
        System.out.println("Two Para constructor");

        }
}

class Client{
 public static void main(String[] args){
 
  //    Demo obj = new Demo();
 //     Demo obj = new Demo();  error
 Demo obj1 = new Demo();
  Demo obj2 = new Demo(10);

  Demo obj3 = new Demo(10,20);       
 
 }
}
