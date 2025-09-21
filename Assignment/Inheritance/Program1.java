
import java.util.*;

class Invoice{

	int invoiceId;
	String customerName;
	double totalAmount;

	Invoice(int invoiceId,String customerName,double totalAmount){
	
		this.invoiceId = invoiceId;
		this.customerName = customerName;
		this.totalAmount = totalAmount;

	}
	void displayInvoice(){
	
		System.out.println("Invoice ID : "+invoiceId);
		System.out.println("Customer Name : "+customerName);
		System.out.println("Total Amount (Before GST) : "+totalAmount);
	}
}
class FinalInvoice extends Invoice{

	double gst =18.0;
	FinalInvoice(int invoiceId,String customerName,double totalAmount){
	
		super(invoiceId,customerName,totalAmount);

	
	}
	void applyGST(){
	
		double gstAmount = (totalAmount*gst)/100;
		double finalBill = totalAmount+ gstAmount;
		
		super.displayInvoice();
		System.out.println("GST(18.0 %): "+gstAmount);
		System.out.println("Final Bill Amount :"+ finalBill);

	
	}
}
class InvoiceID{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Invoice ID : ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Customer Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Total Amount :");
		double amount = sc.nextDouble();
		FinalInvoice invoice =  new FinalInvoice(id,name,amount);
		invoice.applyGST();
	}

}
