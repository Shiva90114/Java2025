class Demo{
              Demo(){    //Demo(Demo this)
	      System.out.println("Constructor");
	      System.out.println(this);
	      }
           public static void main(String[] args){
	   Demo obj = new Demo();   //Demo(obj)
	   System.out.println(obj);
	   
	   }


}
