public class CheckingAccount
{
 public double balance;
 private int number;
 public CheckingAccount(int number1)
  {
   number=number1;
  }
  public void deposit(double amount)
  {
	balance= balance+amount;
	System.out.println("in deposit method: "+balance);
  }
  public void withdraw(double amount) throws InsufficientFundsException
   {
     if(amount<=balance)
	{
	 balance-=amount;
	 System.out.println("in withdraw method if block: "+balance);
	 }
	else
	 {
	  System.out.println("in withdraw method else block: "+balance);
	  double needs= amount-balance;
	  throw new InsufficientFundsException(needs);
	}
}
}