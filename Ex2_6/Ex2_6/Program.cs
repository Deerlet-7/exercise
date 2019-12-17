using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex2_6
{
    class Program
    {
        static void Main(string[] args)
        {
            string s = Console.ReadLine();
            int n = Convert.ToInt32(s);
            Console.WriteLine("十六进制表示: " + Convert.ToString(n,16));
            Console.Read();
        }
    }
}
