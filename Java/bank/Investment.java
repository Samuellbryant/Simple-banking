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
public class Investment extends Account{

    Investment(String bankName,String Owner, double amount)
    {
     super(bankName,Owner,  amount );   
    }
    Investment(String bankName, String Owner)
    {
        super(bankName, Owner);
    }
    
    
      }

