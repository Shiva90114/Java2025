

class IPLPlayer {

	String pName = "KL Rahul";
	int run2025=524;
	static int totalRuns = 8320;

	void playerInfo(){
	
		System.out.println("Player Name : "+pName);
		System.out.println("IPL 2020 runs : "+run2025);
		System.out.println("Player Toatal Runs : "+ totalRuns);
	}
	public static void main(String[] args){
		IPLPlayer ipl2025 = new IPLPlayer();
		ipl2025.playerInfo();
	
                System.out.println("Player Name : "+ipl2025.pName);
                System.out.println("IPL 2020 runs : "+ipl2025.run2025);
                System.out.println("Player Toatal Runs : "+ totalRuns);	
	}
}

/* public static void main(String[] args){
                IPLPlayer ipl2025 = new IPLPlayer();
                ipl2025.playerInfo();

                System.out.println("Player Name : "+pName);
                System.out.println("IPL 2020 runs : "+run2025);
                System.out.println("Player Toatal Runs : "+ totalRuns);

// error		
 * 
 * Program1.java:19: error: non-static variable pName cannot be referenced from a static context
           System.out.println("Player Name : "+pName);
                                               ^
Program1.java:20: error: non-static variable run2025 cannot be referenced from a static context
                System.out.println("IPL 2020 runs : "+run2025);
                                                      ^
2 errors

*/
