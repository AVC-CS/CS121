/**
   The BankAccount class simulates a bank account.
*/

public class BankAccount
{
   private double balance;      // Account balance

   /**
      This constructor sets the starting balance
      at 0.0.
   */

   public BankAccount()
   {
      balance = 0.0;
   }
   
   /**
      This constructor sets the starting balance
      to the value passed as an argument.
      @param startBalance The starting balance.
   */

   public BankAccount(double startBalance)
   {
      balance = startBalance;
   }

   /**
      The deposit method makes a deposit into
      the account.
      @param amount The amount to add to the
      balance field.
   */

   public void deposit(double amount)
   {
      balance += amount;
   }

   /**
      The withdraw method withdraws an amount
      from the account.
      @param amount The amount to subtract from
      the balance field.
   */

   public void withdraw(double amount)
   {
      balance -= amount;
   }

   /**
      The withdraw method withdraws an amount
      from the account.
      @param str The amount to subtract from
      the balance field, as a String.
   */

   public void setBalance(double b)
   {
      balance = b;
   }

   /**
      The getBalance method returns the
      account balance.
      @return The value in the balance field.
   */

   public double getBalance()
   {
      return balance;
   }
}
