abstract class BankAccount{
	protected String accHName,accNo,address,branch;
	BankAccount(String accHName,String accNo,String address,String branch,double balance,double minBalance){
		this.accHName=accHName;
		this.accNo=accNo;
		this.address=address;
		this.branch=branch;
		this.balance=balance;
		this.minBalance=minBalance;
	}
	double balance,minBalance;
	final void deposit(double amount){
		balance+=amount;
	}
	abstract double withdraw(double amount);
	abstract void transfer(double amount,String accNo);
	final double balCheck(){
		return balance;
	}
}
final class SavingsBankAccount extends BankAccount{
	SavingsBankAccount(String accHName,String accNo,String address,String branch,double balance,double minBalance){
		super(accHName,accNo,address,branch,balance,minBalance);
	}
	double withdraw(double amount){
		System.out.println(accHName+"\t"+balance);
		if((balance-amount)>=minBalance){
			balance=balance-amount;
			return amount;
		}
		else{
			return 0.0;
		}
		
	}
	void transfer(double amount,String accNo){
		if((balance-amount)>=minBalance){
			balance=balance-amount;
			System.out.println("Transaction Completed!\nCurrent Balance:"+balCheck());
		}
		else{
			System.out.println("Insufficient funds!\nCurrent Balance:"+balCheck());
		}
	}
}
class SavingsBankAccount1 extends SavingsBankAccount{}
class CurrentBankAccount extends BankAccount{
	String organizationName;
	CurrentBankAccount(String accHName,String accNo,String address,String branch,double balance,double minBalance,String organizationName){
		super(accHName,accNo,address,branch,balance,minBalance);
		this.organizationName=organizationName;
	}
	double withdraw(double amount){
		if((balance-amount)>=-5000.0){
			balance=balance-amount;
			return amount;
		}
		else{
			return 0.0;
		}	
	}
	void transfer(double amount,String accNo){
		if((balance-amount)>=-5000.0){
			balance=balance-amount;
			System.out.println("Transaction Completed!\nCurrent Balance:"+balCheck());
		}
		else{
			System.out.println("Insufficient funds!\nCurrent Balance:"+balCheck());
		}
	}
}
class Customer{
	public static void main(String[] args){
		BankAccount sbacc=new SavingsBankAccount("2CSEB","20000000000","BEC","SBIBEC",5000.0,500.0);
		System.out.println("Current Balance:"+sbacc.balCheck());
		sbacc.deposit(2000.0);
		System.out.println("Updated Balance:"+sbacc.balCheck());
		System.out.println("Current Balance:"+sbacc.balCheck());
		if(sbacc.withdraw(2000.0)==0)
			System.out.println("Transaction Failed!\nCurrent Balance in your account:"+sbacc.balCheck());
		else
			System.out.println("Transaction Completed!\nCurrent Balance in your account:"+sbacc.balCheck());
		sbacc.transfer(2000.0,"123456789");
		sbacc.transfer(2700.0,"123456789");
	}
}
