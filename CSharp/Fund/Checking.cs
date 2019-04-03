using System;
using System.Collections.Generic;
using System.Text;

namespace BankProgram.Fund
{
    public class Checking:Account
    {
        public Checking(String bankName, String accountOwner, double accountBalance) : base(bankName, accountOwner, accountBalance)
        { }
        public Checking(String bankName, String accountOwner) : base(bankName, accountOwner, 0)

        { }
    }
}
