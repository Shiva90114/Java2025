class Demo{
           int x=10;
	   int y=20;

	   void fun(){
	   
	   System.out.println(x);
	    System.out.println(y);
          
       //System.out.println(this.x);
       //System.out.println(this.y);

       
	   }
          public static void main(String[] args){
	  
	  
	  Demo obj = new Demo();
	   System.out.println(obj.x); 
	   
	   System.out.println(obj.y);
	   obj.fun();
	  
	  }


}
