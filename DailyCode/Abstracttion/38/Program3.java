abstract class Parent{
      static  int x = 10;        
	abstract void fun();
}
class Child extends Parent{
                  void fun() {
		  System.out.println(x);
		  }
}

class Client{
public static void main(String[] args){
        System.out.println(Parent.x);          
	Parent obj = new Child();
		  obj.fun();
}

}
