 // Variables
 
class Demo {
   int x = 10;
   void disp() {
              System.out.println(x);
   
   }
  
    public static  void main(String[] args) {
              Demo obj1 = new Demo();
              Demo obj2 = new Demo();
              
	      obj1.disp(); //10
	      obj2.disp();// 10

              obj1.x = 50;

	      obj1.disp();// 50
	      obj2.disp();// 10
    }
}
