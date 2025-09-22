// Artist  - Musician - Arijit Singh

class Artist{
	String name;
	int age;

	Artist(String name,int age){
	
		this.name = name;
		this.age = age;
	}
	void Artist(){
	
		System.out.println("Artist Name :"+name);
		System.out.println("Artist Age :"+age);
	}

}
class Musician extends Artist{
	String instrument;
	Musician(String name,int age,String instrument){
	
		super(name,age);
		this.instrument = instrument;
	}
	void perform(){
	
		super.Artist();
		System.out.println("Instrument : "+instrument);
		System.out.println(name+" is performing on the "+ instrument+" !");
	}

}

class MainMethod{

	public static void main(String[] args){
	Musician m = new Musician("Arijit Singh",37,"Guitar");
        m.perform();	
	}
}
