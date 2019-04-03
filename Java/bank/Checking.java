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
public class Checking extends Account {
    
    
    
    public Checking(String bankName,String Owner,double initialBalance)
    {
        super(bankName,Owner,initialBalance );
    }

    public String toString()
    {
        String accountType = "This is "+ accountOwner+"'s" +" Checking account with $"+ accountBalance + " Balance";
        
        return accountType;
    }
   }
   
    

