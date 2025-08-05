

enum  LineUp{

	Rohit,
	Gill,
	Virat,
	KLRahul,
	Ishan;

	LineUp(){
	
		System.out.println("In Constructor");
	}

	public static void main(String[] args){
        
		LineUp player = LineUp.Virat;

		switch(player){
		
			case Rohit: 
				System.out.println("Sharma");
				break;

			case Gill:
                                System.out.println("Saara");
                                break;

			case Virat:
                                System.out.println("Ban");
                                break;

			case KLRahul:
                                System.out.println("Anna");
                                break;
			case Ishan:
                                System.out.println("Negi");
                                break;
			default:
                                System.out.println("No Player Name");
                                break;

	                  	}

	
}
}
