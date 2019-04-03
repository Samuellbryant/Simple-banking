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
public class Program {
    public static void main(String[]args)
    {
       Account  checking= new Checking("Suntrust","Bob",100);
       Account indivualInvestment = new Individual("Suntrust", "Patty",1000);
       Account corporateInvestment = new Corporate("Subtrust", "Patty",10000);
     //checking.deposit(200);
     checking.withdraw(25);
     corporateInvestment.transfer(100, indivualInvestment);
     //System.out.println(checking);
     
     System.out.println(corporateInvestment);
    
    System.out.println(indivualInvestment);
    
     checking.deposit(100);
     System.out.println(checking);
     //indivualInvestment.withdraw(10);
        //System.out.println( indivualInvestment.getBalance());
     
     
    }
}
