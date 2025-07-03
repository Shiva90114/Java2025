//Marker Interface
interface Core2Web {

}
class C2WStud implements Core2Web {


}
class OtherStud {

}
class CompanyInterview {
        static void selectProcess(Object obj){
	     if(obj instanceof Core2Web) {
	             System.out.println("Direct CEO");
	     }else {
                     System.out.println("5 Interview ghe");	
	     }
	}
	public static void main(String[] args){
            C2WStud obj1 = new C2WStud();
	    OtherStud obj2 = new OtherStud();
            
	    selectProcess(obj1);
	    selectProcess(obj2);
	}
}
