// List IMP
import java.util.*;

class Player{

	String pName;
	int jerNo;
	Player(String pName,int jerNo){
	
		this.pName =pName;
		this.jerNo =jerNo;

	}
	void disp(){
	
		System.out.println("Player Nmae : "+pName+" Jersey No. : "+ jerNo);
	}
}
class ListDemo{

	public static void main(String[] args){
	ArrayList al = new ArrayList();
	al.add(new Player("Dhoni",7));
	al.add(new Player("Virat",18));
	al.add(new Player("Rohit",45));
	al.add(new Player("Shubhuman",77));
	
	System.out.println(al);

	//
	Iterator itr = al.iterator();
	while(itr.hasNext()){
	
	        // print address	
		System.out.println(itr.next());
                
		//itr.next().disp();
		//Player obj = itr.next();
	}

	itr = al.iterator();
	while(itr.hasNext()){

              
                Player obj = (Player)itr.next();
                obj.disp();
        }

	}
}
/*Player obj = itr.next();
 * error
 *
 * Program1.java:33: error: incompatible types: Object cannot be converted to Player
                Player obj = itr.next();
		

*itr.next().disp();
* error

* error: cannot find symbol
                itr.next().disp();

*/
