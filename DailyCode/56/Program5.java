// ClassLoader

class Demo{

}

class DemoLoader{

	public static void main(String[] args){

		ClassLoader appLoader = Demo.class.getClassLoader();
	
		ClassLoader bootLoader1 = String.class.getClassLoader();
                ClassLoader extLoader = com.sun.nio.zipfs.ZipDirectorySystem.class.getClassLoader();// com.sun.nio.zipfs.ZipDirectory change
		
		System.out.println(appLoader);     // appp class loader
		System.out.println(extLoader);       // null // bootClassLoader // ext

		System.out.println(bootLoader1);// null // bootClassLoader
	}
}
