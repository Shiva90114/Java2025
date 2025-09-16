// ClassLoader

class Demo{

}

class DemoLoader{

	public static void main(String[] args){

		ClassLoader appLoader = Demo.class.getClassLoader();
	
		ClassLoader bootLoader1 = String.class.getClassLoader();
                ClassLoader bootLoader2 = System.class.getClassLoader();
		
		System.out.println(appLoader);     // appp class loader
		System.out.println(bootLoader1);       // null // bootClassLoader

		System.out.println(bootLoader2);// null // bootClassLoader
	}
}
