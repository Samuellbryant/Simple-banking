using System;
using System.Collections.Generic;
using System.Text;

namespace BankProgram.Fund
{
   public  abstract class Investment:Account
    {
        public Investment(String bankName, String accountOwner, double accountBalance) : base(bankName, accountOwner, accountBalance)
        { }
        public Investment(String bankName, String accountOwner) : base(bankName, accountOwner, 0)

        { }
        public override string ToString()
        {
            return base.ToString();
        }
    }
}
