 // Variables  Static 
 
class Demo {
   int x = 10;
   static int y = 20;

   void disp() {
              System.out.println(x);
	       System.out.println(y);
   
   }
  
    public static  void main(String[] args) {
              Demo obj1 = new Demo();
              Demo obj2 = new Demo();
              
	      obj1.disp(); //10 20
	      obj2.disp();// 10 20

              obj1.y = 50;

	      obj1.disp();// 10 50
	      obj2.disp();// 10 50
    }
}
