// ClassLoader System.out.println(appLoader);

class Demo{

}

class DemoLoader{

	public static void main(String[] args){

		ClassLoader appLoader = Demo.class.getClassLoader();
	
		ClassLoader extLoader = appLoader.getParent();

		ClassLoader bootLoader = extLoader.getParent();
		System.out.println(appLoader);  //java
		System.out.println(extLoader);// java
		System.out.println(bootLoader);// native write
	}
}
