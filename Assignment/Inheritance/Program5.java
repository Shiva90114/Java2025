// Bank Account

class Account{

	int accountNum;
	String holderName;
	Account(int accountNum,String holderName){
	
		this.accountNum =accountNum;
		this.holderName = holderName;
	}
	void AccountDetails(){
	System.out.println("Account Number :"+accountNum);
	System.out.println("Account Holder Name :"+holderName);
	}
}
class SavingAccount extends Account{

	double interestRate;
	SavingAccount(int accountNum,String holderName,double interestRate){
	         super(accountNum,holderName);
	         this.interestRate = interestRate;
	}
	double calculate(double amount){
	            AccountDetails();
		    System.out.println("Interest Rate : "+interestRate+"%");
		    System.out.println("Deposit Amount "+amount);
		    double interest = (amount*interestRate)/100;
		    System.out.println("Calculated Interest :"+interest);
		    return interest;

	}
}
class Bank{
	public static void main(String[] args){
	
		SavingAccount sa = new SavingAccount(101,"Shiva",5.5);
		sa.calculate(200000);
	}
}
