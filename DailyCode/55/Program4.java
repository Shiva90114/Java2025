// Comparator

import java.util.*;

class Player  {

	String playerName;
	int jerNo;
	int runs;

	Player(String playerName,int jerNo,int runs){
	
		this.playerName = playerName;
		this.jerNo = jerNo;
		this.runs = runs;

	}

	public String toString(){
	
		return "playerName : "+playerName+" JerNo : "+jerNo+" Runs :"+runs;
	}
}
class SortByJerNo implements Comparator<Player>{

	public int compare(Player obj1,Player obj2){
	
		return obj1.jerNo - obj2.jerNo;
	}
}
class QueueDemo{

	public static void main(String[] args){
	
		PriorityQueue pq = new PriorityQueue(new SortByJerNo());
		pq.offer(new Player("Dhoni",7,4500));
		pq.offer(new Player("Virat",18,5000));
		pq.offer(new Player("KLRahul",1,3000));
		pq.offer(new Player("Virat",18,4000));

		//
		//Collections.sort(new SortByJerNo());
                // error
		System.out.println(pq);
	}

}
