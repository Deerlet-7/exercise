using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex2_5
{
    class Program
    {
        static void Main(string[] args)
        {
            double PAI = 1;
            for (double i = 1;i<1001;i++)
            {
                PAI *= ((2 * i) / (2 * i - 1)) * ((2 * i) / (2 * i + 1));
            }
            Console.Write("{0}", PAI*2);
            Console.Read();
        }
    }
}
