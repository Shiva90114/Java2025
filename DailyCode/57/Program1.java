
class LoaderDemo{

	public static void main(String[] args){

		//        /usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/rt.jar
		System.out.println(String.class.getClassLoader());
		
		System.out.println(Thread.class.getClassLoader());

		//       current Directory
		System.out.println(LoaderDemo.class.getClassLoader());

	//error
	//System.out.println(ZipDirectoryStream.class.getClassLoader());
	
	
	//     /usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/ext/ .jar  
		System.out.println(com.sun.nio.zipfs.ZipDirectoryStream.class.getClassLoader());
	}
}
