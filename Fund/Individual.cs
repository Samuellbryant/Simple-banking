using System;
using System.Collections.Generic;
using System.Text;

namespace BankProgram.Fund
{
   public  class Individual:Investment
    {
        public Individual(String bankName, String accountOwner, double accountBalance) : base(bankName, accountOwner, accountBalance)
        { }
        public Individual(String bankName, String accountOwner) : base(bankName, accountOwner, 0)

        { }
        public override void withdraw(double amount)
        {
            if ((accountBalance < amount || accountBalance == 0)||(amount>500))

           {
                throw new ArithmeticException("Can't withdraw the money from " + this.GetType().Name);


            }
            else

                accountBalance -= amount;
        }
    }
    }

