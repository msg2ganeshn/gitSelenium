package Bank.com;

public class Bank 


{
	
	public Bank (int balance)
	{
		//balance = this.balance;
		setBalance(balance);

	}
	
	
	private int accountnumber;
	
	private int balance;
	
	private String Customername;
	
	private String email;
	
	private String phoneno;

	public int getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(int accountnumber) 
	{
		this.accountnumber = accountnumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getCustomername() {
		return Customername;
	}

	public void setCustomername(String customername) {
		Customername = customername;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public static void main(String[] args)
	{
	
		Transaction TN = new Transaction();
		System.out.println("Balance after Deposit is:" + TN.deposit());
		System.out.println("Balance after Withdrawal is:" +	TN.Withdraw());
		
	}
	
	
	
	
	
}
