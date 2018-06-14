using System;
using BankProgram.Fund;

namespace BankProgram
{
    class Program
    {
        static void Main(string[] args)
        {
            try
            {
                Account checking = new Checking("BankName", "bob", 200);
                checking.deposit(200);
                checking.withdraw(10);
                ///Account account = new Account("hthed55", "tdhwsrr", 200);

                Investment inv = new Individual("Bank", "bob", 600);
                inv.deposit(1000);
                Investment cap = new Corporate("Sam's Bank", "Sam", 10000);
                cap.tranfer(1000, inv);
                Console.WriteLine(checking);
                Console.WriteLine(inv);
                Console.WriteLine(cap);
                Console.WriteLine("My first name {0} and my last name {1}", "Sam", "Bryant");
                Console.WriteLine("Press any key to continue");
                Console.ReadKey();
            }
            catch (ArithmeticException e)
            {
                Console.WriteLine(e.Message);
            }
            catch (Exception e)
            {
                Console.WriteLine("Something happen {0}, {1}", "hi" ,"bye" );
            }
        }
    }
}
