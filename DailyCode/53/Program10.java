// Comparable
import java.util.*;
class Player implements Comparable<Player>{
	String pName;
	int jerNo;
	Player( String pName,int jerNo){
	
		this.pName=pName;
		this.jerNo=jerNo;
	}
	public int compareTo(Player obj){
	
		//return jerNo-obj.jerNo;
		 return pName.compareTo(obj.pName);
	}
	void disp(){
	
		System.out.println("Player Name : "+pName+"Jersey No. : "+jerNo);

	}

}


class ArraylistDemo{

        public static void main(String[] args){

                ArrayList ts = new ArrayList();

                ts.add(new Player("MS Dhoni",7));
                ts.add(new Player("Rohit",45));
                ts.add(new Player("Virat",18));
                ts.add(new Player("Shubman",77));


                Collections.sort(ts);
		Iterator itr = ts.iterator();


	while(itr.hasNext()){
	
	
		Player obj = (Player)itr.next();
	
		obj.disp();
	}


		

	}
}	
