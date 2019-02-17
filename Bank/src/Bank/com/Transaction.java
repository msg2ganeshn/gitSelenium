package Bank.com;

public class Transaction 

{
	
	Bank BK = new Bank(15000);
	
	
	public int deposit()
	
	{
		int deposit = 2000;
		int BalanceAmt;

		BK.setCustomername("Ganesh");
		BK.setAccountnumber(1001);
		BK.setEmail("TestGN@gmail.com");
		BK.setPhoneno("8848484848");
		System.out.println("NAME:" + BK.getCustomername());
		System.out.println("Accountnumber:" + BK.getAccountnumber());
		System.out.println("NAME:" + BK.getEmail());

		BalanceAmt = deposit + (BK.getBalance());

		
		return BalanceAmt;
	}

	
	public int Withdraw()
	{
		int NetAmount;
		int Withdraw = 2000;

		BK.setCustomername("Dev");
		BK.setAccountnumber(1001);
		BK.setEmail("TestGN@gmail.com");
		BK.setPhoneno("9848484848");
		BK.setBalance(3000);

		NetAmount = BK.getBalance() - Withdraw;
		
		return NetAmount;

		
	}
}


