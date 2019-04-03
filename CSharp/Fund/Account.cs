using System;
using System.Collections.Generic;
using System.Text;

namespace BankProgram.Fund
{
    public abstract class Account : Bank
    {

        protected String accountOwner;
        protected double accountBalance;

        public Account(String bankName, String owner, double balance) : base()
        {
            BankName = bankName;
            accountBalance = balance;
            accountOwner = owner;

        }
        public Account(String bankName, String owner) : base()
        {
            BankName = bankName;
            accountBalance = 0.0;
            accountOwner = owner;
        }
        public double getAmount {
            get { return accountBalance;
            }
        }

        public virtual void withdraw(double amount)
        {
            if (accountBalance < amount || accountBalance == 0)
            {
                throw new ArithmeticException("Can't withdraw the money from "+ this.GetType().Name);
            }
            else

                accountBalance -= amount;
        }
        public void deposit(double amount)
        {
            accountBalance += amount;
        }
        public void tranfer(double amount, Account toAccount)
        {
            withdraw(amount);
            toAccount.deposit(amount);

        }
        public override string ToString()
        {
            return base.ToString()+  accountOwner+", you have $" + accountBalance+ " in your " + this.GetType().Name + " account" ;
        }



    }
}
