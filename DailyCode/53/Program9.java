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


class TreeSetDemo{

        public static void main(String[] args){

                TreeSet ts = new TreeSet();

                ts.add(new Player("MS Dhoni",7));
                ts.add(new Player("Rohit",45));
                ts.add(new Player("Virat",18));
                ts.add(new Player("Shubman",77));

//                System.out.println(ts);
// print  Address

        Iterator itr = ts.iterator();
	while(itr.hasNext()){
	
	
		Player obj = (Player)itr.next();
	
		obj.disp();
	}


		

	}
}
/*
 * ts.add(new Player("MS Dhoni",7));
                ts.add(new Player("Rohit",45));
                ts.add(new Player("Virat",18));
                ts.add(new Player("Shubman",77));

*	
 *error

 *
 * Exception in thread "main" java.lang.ClassCastException: Player cannot be cast to java.lang.Comparable
        at java.util.TreeMap.compare(TreeMap.java:1294)
        at java.util.TreeMap.put(TreeMap.java:538)
        at java.util.TreeSet.add(TreeSet.java:255)
        at TreeSetDemo.main(Program9.java:25)
	*/
