// Comparator
import java.util.*;
class Player {
	String pName;
	int jerNo;
	Player( String pName,int jerNo){
	
		this.pName=pName;
		this.jerNo=jerNo;
	}
	
	void disp(){
	
		System.out.println("Player Name : "+pName+"Jersey No. : "+jerNo);

	}

}
class SortByName implements Comparator<Player>{

	public int compare(Player obj1,Player obj2){
	
		return obj1.pName.compareTo(obj2.pName);
	}
}
class SortByJerNo implements Comparator<Player>{

        public int compare(Player obj1,Player obj2){

                return obj1.jerNo - obj2.jerNo;
        }
}


class ArraylistDemo{

        public static void main(String[] args){

                ArrayList ts = new ArrayList();

                ts.add(new Player("MS Dhoni",7));
                ts.add(new Player("Rohit",45));
                ts.add(new Player("Virat",18));
                ts.add(new Player("Shubman",77));


              
		Collections.sort(ts,new SortByName());
		Iterator itr = ts.iterator();
                while(itr.hasNext()){
	
	
		Player obj = (Player)itr.next();
	
		obj.disp();
	}

	 Collections.sort(ts,new SortByJerNo());
                Iterator itr1 = ts.iterator();
                while(itr1.hasNext()){


                Player obj = (Player)itr1.next();

                obj.disp();
        }

		

	}
}	
