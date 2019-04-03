/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author samue
 */
public class Account extends Bank  {
    
    protected String accountOwner;
    protected double accountBalance;
    public Account(String bankName,String Owner, double account  )
    {
        super(bankName);
        accountOwner = Owner;
        accountBalance = account;
    }
    public Account(String bankName, String Owner )
    {
        super(bankName);
        accountOwner= Owner;
        accountBalance = 0;
    }
    public  void deposit(double amount)
    {
        accountBalance+=amount;
    }
   public void withdraw (double amount )
   {
       if(accountBalance == 0 || accountBalance < amount )
    System.out.println("Can't withdraw "+amount);
       else 
       accountBalance-= amount;
   }
   // this is for debugging 
   public double getBalance()
   {
       return accountBalance;
   }
   public  void transfer(double amount,  Account toAccount)
   {
       if(accountBalance<amount )
       System.out.println("Can't tranfer the funds");
      
       else{
       withdraw(amount);
       toAccount.deposit(amount);
       }
       
     
   }
   
   
}
