package ReverseBalance;

public class TransactionDetails

{
	public TransactionDetails(int Minbalance, String Customername, int Accountnumber, String email, String phoneno)
	
	{
		/*
		 * this.Minbalance = Minbalance; this.Customername = Customername; this.email =
		 * email; this.accountnumber = Accountnumber; this.phoneno = phoneno;
		 */
		
		setAccountnumber(Accountnumber);
		setMinbalance(Minbalance);
		setCustomername(Customername);
		setPhoneno(phoneno);
		setEmail(email);
		
	
	}
	
	
	public TransactionDetails()
	{
	
		int Minbalance = 2000;
		String Customername = "Test";
		int Accountnumber = 1001;
		String Email = "Test@gmail.com";
		String phoneno = "393939393";
		
		
	}
	
	private int accountnumber;
	
	private int Minbalance;
	
	private String Customername;
	
	private String email;
	
	private String phoneno;

	
	public int getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}

	public int getMinbalance() {
		return Minbalance;
	}

	public void setMinbalance(int minbalance) {
		Minbalance = minbalance;
	}

	public String getCustomername() {
		return Customername;
	}

	public void setCustomername(String customername) {
		Customername = customername;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

public int deposit()
	
	{
		int deposit = 2000;
		int BalanceAmt;

		/*
		 * setCustomername("Ganesh"); setAccountnumber(1101);
		 * setEmail("TestGN@gmail.com"); setPhoneno("8848484848");
		 */
		System.out.println("NAME:" + getCustomername());
		System.out.println("Accountnumber:" + getAccountnumber());
		System.out.println("Email:" + getEmail());
		System.out.println("Phoneno:" + getPhoneno());


		BalanceAmt = deposit + (getMinbalance());

		
		return BalanceAmt;
	}

	
	public int Withdraw()
	{
		int BalanceafterWithdraw;
		int Withdraw = 1000;

		/*
		 * setCustomername("Dev"); setAccountnumber(2101); setEmail("TestGN@gmail.com");
		 * setPhoneno("9848484848"); setMinbalance(3000);
		 */

		BalanceafterWithdraw = Minbalance - Withdraw;
		
		return BalanceafterWithdraw;

		
	}

	
	
	

}
