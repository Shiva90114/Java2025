//
//  error
import  java.awt.*;
import java.net.*;
import java.io.*;

class OpenWebsite{

	public static void main(String[] args)throws URISyntaxException,IOException{
	
	        try{
		String url = "https://www.youtube.com";
		
			URI obj = new URI(url);

		Desktop desk = Desktop.getDesktop();
		desk.browse(obj);
		}catch(URISyntaxException | IOException e){
		e.printStackTrace();
		}
	}
}
/*
  URI obj = new URI("www.youtube.com");
 * error
 * Program3.java:9: error: unreported exception URISyntaxException; must be caught or declared to be thrown
                URI obj = new URI("www.youtube.com");
                          ^
1 error
 */
