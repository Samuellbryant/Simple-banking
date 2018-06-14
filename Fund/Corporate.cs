using System;
using System.Collections.Generic;
using System.Text;

namespace BankProgram.Fund
{
    public class Corporate:Investment
    {
        public Corporate(String bankName, String accountOwner, double accountBalance) : base(bankName, accountOwner, accountBalance)
        { }
        public Corporate(String bankName, String accountOwner) : base(bankName, accountOwner, 0)

        { }
    }
}
