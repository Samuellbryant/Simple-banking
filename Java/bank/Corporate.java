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
public class Corporate extends Investment  {
   
    
 
    public Corporate(String bankName,String Owner, double amount)
    {
      super(bankName,Owner, amount);  
    }
    
 public String toString()
    {
        String accountType = "This is "+ accountOwner+"'s" +" Corporate Investing account with $"+ accountBalance + " Balance";
        
        return accountType;
    }
    
   
    
    


}
