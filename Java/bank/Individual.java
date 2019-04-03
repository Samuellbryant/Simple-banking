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
public class Individual extends Investment {
   
   
   public Individual(String bankName,String Owner,double amount)
   {
       super(bankName,Owner, amount );
   }
   public Individual (String bankName, String Owner)
   {
       super(bankName,Owner);
   }
   
    @Override 
    public void withdraw(double amount)
    {
           if(amount >500 )
    System.out.println("Can't withdraw "+amount);
       else 
       accountBalance-= amount;
           
   }
     public String toString()
    {
        String accountType = "This is "+ accountOwner+"'s" +" Individual Investinng account with $"+ accountBalance + " Balance";
        
        return accountType;
    }
}
