// Comparable

import java.util.*;

class Player implements Comparable<Player> {

	String playerName;
	int jerNo;
	int runs;

	Player(String playerName,int jerNo,int runs){
	
		this.playerName = playerName;
		this.jerNo = jerNo;
		this.runs = runs;

	}
	public int compareTo(Player obj) {
	
		// return runs - obj.runs;
		// return -(runs - obj.runs);
		  return playerName.compareTo(obj.playerName);
	}
	public String toString(){
	
		return "playerName : "+playerName+" JerNo : "+jerNo+" Runs :"+runs;
	}
}
class QueueDemo{

	public static void main(String[] args){
	
		PriorityQueue pq = new PriorityQueue();
		pq.offer(new Player("Dhoni",7,4500));
		pq.offer(new Player("Virat",18,5000));
		pq.offer(new Player("KLRahul",1,3000));
		pq.offer(new Player("Virat",18,4000));

		System.out.println(pq);
	}

}
