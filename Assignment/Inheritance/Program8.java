// Event Sport-FootBall

class Event{

	String eventName;
	String location;
	String info;

	Event(String eventName,String location,String info){
	
		this.eventName=eventName;
		this.location = location;
		this.info = info;
	}
	void Event(){
	
		System.out.println("Event Name : "+eventName);
		System.out.println("Event Location : "+location);
		System.out.println("Event Info : "+info);
	}
}
class SportEvent extends Event{

	String sportType;
	SportEvent(String eventName,String location,String info,String sportType){
	
		super(eventName,location,info);
		this.sportType =sportType;

	}
	void FullEvent(){
	
		super.Event();
		System.out.println("Sport Type :"+sportType);
	}
}
class Sport{

	public static void main(String[] args){
	
		SportEvent se = new SportEvent("National Games","Pune","Annual multi-sport event","FootBall");
		se.FullEvent();
	}
}
