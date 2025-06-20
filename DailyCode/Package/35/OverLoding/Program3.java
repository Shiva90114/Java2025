



class Addition {
                  void add(int x, int y){   // add(int,int)
		  System.out.println("Int-Int");
		  
		  }
		  void add(int x, int y,int z){ // add(int,int,int)
                  System.out.println("Int-Int-Int");

                  }
		  void add(int a,float b){   // add(int,float)
                  System.out.println("Int-Float");

                  }


}
class Client {

public static void main(String[] args){
             Addition obj = new Addition();
	     obj.add(10,20); 
             obj.add(10,20,30);


}
}
