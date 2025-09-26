class Papa {

	void getProperty(){
	
		System.out.println("Bunglow");
	}

        void career(){
                                                                                                                                                                            System.out.println("Shiva Doctor Honar");                                                                                                                         }

        void marry(){
                                                                                                                                                                            System.out.println("Shiva = Deepika Padukone");                                                                                                                         }
}
class Shiva extends Papa {


        void career(){
                                                                                                                                                                            System.out.println("Shiva Engineer Zala ");                                                                                                                         }
        void marry(){
                                                                                                                                                                            System.out.println("Shiva = Kriti Sanon");                                                                                                                         }
}
class Kaka{
	public static void main(String[] args){
	
		Papa p = new Papa();
		p.getProperty();    // Bunglow
		p.career();         // Doctor
		p.marry();          // Shiva = Deepika Padukone
	
	        Shiva s = new Shiva();                                                                                                                                      s.getProperty();    // Bunglow
	        s.career();         // Engineer                                 
                s.marry();          // Shiva = Kriti Sanone
	        
	        Papa p1 = new Shiva();
                p1.getProperty();    // Bunglow
                p1.career();         // Doctor
                p1.marry();	

	}
}
