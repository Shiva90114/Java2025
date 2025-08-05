

enum ProgLang{

	C,CPP,Java,Python
		// Java is static
}
class Demo{

	public static void main(String[] args){
	
		ProgLang lang = ProgLang.Java;
		System.out.println(lang);
		System.out.println(lang.name());
		System.out.println(lang.toString());
		System.out.println(lang.ordinal());
	}
}
