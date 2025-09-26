//Interface             

interface Yewale {

	void makingTea();

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

		Yewale y2 = new BaramatiYewale();
                y2.makingTea();
	}
}
//
// Yewale y = new Yewale(); // only write
// error
// Yewale is abstract; cannot be instantiated
