package ReverseBalance;

public class Balance 

{
	
	public static void main(String[] args)
	
	{
		TransactionDetails Ganesh = new TransactionDetails();
		System.out.println("Transaction details of Ganesh");
		Ganesh.setAccountnumber(3001);
		Ganesh.setCustomername("Ganesh");
		Ganesh.setEmail("TestGN@gmail.com");
		Ganesh.setMinbalance(1000);
		Ganesh.setPhoneno("94959595955");
		System.out.println("Balance after deposit: " + Ganesh.deposit());
		System.out.println("Balance after Withdraw: " + Ganesh.Withdraw());

		
		TransactionDetails Shri = new TransactionDetails(5000, "Shri", 3002, "TestShri@gmail.com", "34303404094");
		System.out.println("\n"+ "Transaction details of Shri");
		System.out.println("Balance after deposit: " + Shri.deposit());
		System.out.println("Balance after Withdraw: " + Shri.Withdraw());

		
		
		//	public TransactionDetails(int Minbalance, String Customername, int Accountnumber, String email, String phoneno)

		
	}
	
	

}
