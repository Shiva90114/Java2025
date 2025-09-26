//Interface             
// default
interface Yewale {

	void makingTea();

	default void creamRolls() {
	
		System.out.println("Make Own CreamRoll");
	}

}
class PuneYewale implements Yewale{
	        
	public void makingTea(){
		System.out.println("Open at 6AM");
		System.out.println("Best Tea");
		}
	
	
}
class BaramatiYewale implements Yewale{
	 public void makingTea(){
		System.out.println("Open at 7AM");
                System.out.println("Best Tea");
                }

}
class Sukh{
        public static void main(String[] args){
		Yewale y1 = new PuneYewale();
		y1.makingTea();
                y1.creamRolls();
		Yewale y2 = new BaramatiYewale();
                y2.makingTea();
	}
}

