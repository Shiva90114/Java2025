// Transport

class Transport{
	String mode;
	int maxSpeed;

	Transport(String mode,int maxSpeed){
	
		this.mode= mode;
		this.maxSpeed = maxSpeed;
	}
	void Transport(){
	
		System.out.println("Mode : "+mode);
		System.out.println("Max Speed :"+maxSpeed+"km/h");
	}

}
class Bus extends Transport {
	int routeNo;
	int seatCount;

	Bus(String mode,int maxSpeed,int routeNo,int seatCount){
	
		super(mode,maxSpeed);
		this.routeNo = routeNo;
		this.seatCount = seatCount;
	}
	void RouteDetails(){
	
		super.Transport();
		System.out.println("Route Number : "+routeNo);
		System.out.println("SeatCount : "+seatCount);
	}
}
class Main{

	public static void main(String[] args){
		// maxSpeed 70
		// RouteNum =30
		// Seat Count 40
	Bus b = new Bus("Road",70,30,40);
	b.RouteDetails();
	}
}
