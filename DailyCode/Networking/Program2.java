import java.net.*;

class URLDemo {

	public static void main(String[] args)throws  MalformedURLException{
	
		URL obj = new URL("https://www.core2web.in:80");

		System.out.println(obj.getProtocol());
		System.out.println(obj.getPort());
		System.out.println(obj.getFile());
	}
}

/*
 *URL obj = new URL("https://www.core2web.in");

// error
//
 * Program2.java:7: error: unreported exception MalformedURLException; must be caught or declared to be thrown
                URL obj = new URL("https://www.core2web.in");
                          ^
1 error
*/
