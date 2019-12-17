using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex2_7
{
    class Program
    {
        static void Main(string[] args)
        {
            string s1 = Console.ReadLine();
            string s2 = Console.ReadLine();
            double x = Convert.ToDouble(s1);
            int n = Convert.ToInt32(s2);
            hermite(n,x);
            Console.Read();
        }
        static double hermite(int n,double x)
        {
            double h;
            switch(n)
            {
                case 0:
                    h = 1;
                    Console.Write("{0} ,", h);
                    break;
                case 1:
                    h=2*x;
                    Console.Write("{0} ,", h);
                    break;
                default:
                    h = 2 * x * hermite(n - 1,x) - 2 * (n - 1) * hermite(n - 2,x);
                    Console.Write("{0} ,", h);
                    break;
            }
            return h;
        }
    }
}
