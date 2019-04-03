using System;
using System.Collections.Generic;
using System.Text;

namespace BankProgram.Fund
{
   public  abstract class  Bank
    {
        
         protected String bankName;
        public String BankName
        {
            get { return bankName; }
            set { bankName = value; }
                
         }
        public override string ToString()
        {
            return "Thank you for choosing "+bankName+"! ";
        }

    }
}
