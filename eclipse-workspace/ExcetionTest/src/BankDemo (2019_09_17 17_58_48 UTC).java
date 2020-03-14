public class BankDemo
{
  public static void main(String[] args)
	{
	 CheckingAccount c=new CheckingAccount(101);

 try
  {
   System.out.println("Depositing Rs500...");
   c.deposit(500.00);
   System.out.println("Withdrawing Rs100...");

   c.withdraw(100.00);
   System.out.println("Withdrawing Rs600...");
    c.withdraw(600.00);
    System.out.println("after Withdrawing Rs600...");
  }catch(InsufficientFundsException e)
    {
	System.out.println("Sorry, but you are short Rs" +e.getAmount());
	e.printStackTrace();
}
}
}