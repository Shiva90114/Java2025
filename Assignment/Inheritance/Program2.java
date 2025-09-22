
import java.util.*;

class Ticket{

	int ticketNo;
	String passengerName;
	String seatClass;
	double base;

	Ticket(int ticketNo,String passengerName,String seatClass,double base){
	this.ticketNo = ticketNo;
	this.passengerName = passengerName;
	this.seatClass = seatClass;
	this.base= base;

	}
}
class FightTicket extends Ticket{
	FightTicket(int ticketNo,String passengerName,String seatClass,double base){
		super(ticketNo,passengerName,seatClass,base);
	}
	void calculateBill(){
	
		double addCharge =0;
		if(seatClass.equalsIgnoreCase("Economy")){
		addCharge =0;
		} else if(seatClass.equalsIgnoreCase("Business")){
		addCharge= base*0.40;
		}else if(seatClass.equalsIgnoreCase("First")){
		addCharge = base*0.80;
		} else {
	            System.out.println("Invalid seat class Entered");	
		
		return;
	}
	double totalFare = base + addCharge;
	System.out.println("\n ------Ticket Details ------");
	System.out.println("Ticket no. : "+ticketNo);
	System.out.println("Passenger Name : "+passengerName);
	System.out.println("Seat Class  : "+seatClass);
	System.out.println("Base Fare : "+base);
	System.out.println("Additional Charge : "+addCharge);
	System.out.println("Total Fare : "+totalFare);
	}
}
class Fight{

	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

	System.out.println("Enter Ticket No. : ");
	int tno = sc.nextInt();
	sc.nextLine();
	System.out.println("Enter Passenger Name : ");
        String name = sc.nextLine();
	System.out.println("Enter Seat Class(Economy/Business/First): ");
        String seatClass = sc.nextLine();
	System.out.println("Enter Base Fare: ");
        double fare = sc.nextDouble();
	FightTicket ticket = new FightTicket(tno,name,seatClass,fare);
	ticket.calculateBill();

	sc.close();
	}
}
