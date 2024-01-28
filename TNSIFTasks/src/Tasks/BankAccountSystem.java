package Tasks;
 class BankAccount{
	
	private String accountNumber;
	private String accountHolder;
	private double balance;
	
	public BankAccount(String accountNumber,String accountHolder,double balance) {
		this.accountNumber=accountNumber;	
		this.accountHolder=accountHolder;
		this.balance=balance;
	}
	
	public void deposit(double amount) {
		if(amount>0) {
			balance+=amount;
			System.out.println("Deposited Rs." + amount + " to account " +accountNumber);
		}
		else {
			System.out.println("Invalid deposit amount");
		}
	}
	
    public void withdrawal(double amount) throws InsufficientBalanceException {
    	
		if(amount>0) {
			if(amount<=balance) {
				balance-=amount;
				System.out.println("Withdraw Rs." +amount + " from account " + accountNumber);
			}
			else {
				throw new InsufficientBalanceException("Insufficient Balance !!!  \nYour withdrawal amount is " +amount + " and balance is " +balance );
			}
		}
		else {
			System.out.println("Invalid withdrawal amount.");
		}
	}

    public void displayInfo() {
    	System.out.println("Account Number: "+accountNumber);
    	System.out.println("Account Holder: "+accountHolder);
    	System.out.println("Balance: Rs."+balance);
    }
 }
    
    public class BankAccountSystem{

	public static void main(String[] args) {
		BankAccount acc1=new BankAccount("IOB7820036","Shakthi",0);
		BankAccount acc2=new BankAccount("IOB7820071","Kathir",0);
		
		acc1.deposit(10.00);
		try {
		  acc1.withdrawal(100.00);
		}
		catch(InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("-----------Information------------");
		acc1.displayInfo();
		
		System.out.println("\n");
		
		acc2.deposit(1500);
		try {
			acc2.withdrawal(1000);
		}
		catch(InsufficientBalanceException e){
			System.out.println(e.getMessage());
		}
		System.out.println("-----------Information------------");
		acc2.displayInfo();
	}

}

  class InsufficientBalanceException extends Exception{
	  public InsufficientBalanceException(String message) {
		  super(message);
	 
  }
  }