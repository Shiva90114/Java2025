import java.io.*;
import java.net.*;
import java.util.*;
class URLConnectionDemo{

	public static void main(String[] args)throws IOException{
	
		URL obj = new URL("https://www.core2web.in");
		URLConnection conn = obj.openConnection();
		System.out.println("Last modified"+ new Date(conn.getLastModified()));
	}
}
// Output -
// Last modifiedSat Jul 05 10:07:01 UTC 2025
