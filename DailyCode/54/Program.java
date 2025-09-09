// Properties
import java.util.*;
import java.io.*;
class MapDemo{

	public static void main(String[] args)throws IOException{
	
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("Founder.properties");
		p.load(fis);
		System.out.println(p);
		String data = p.getProperty("OpenAI");
		System.out.println(data);
		p.setProperty("OpenAI","Elon Musk");
		FileOutputStream fos =  new FileOutputStream("Founder.properties");
		p.store(fos,"Update by Shivanand Phadatare");

	}
}
