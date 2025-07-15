class Demo {

	void fun(Exception obj) {
	
	}
}
class Client {

	public static void main(String[] args){
	Demo obj = new Demo();
	obj.fun(new Exception());
	}

}
