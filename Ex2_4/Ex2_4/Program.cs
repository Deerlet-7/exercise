using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex2_4
{
    class Program
    {
        static void Main(string[] args)
        {
            string s = Console.ReadLine();
            int n = Convert.ToInt32(s);
            upset(n);
        }
        static void upset(int n)
        {
            int[] arr = new int[4];
            for(int i = 0;i<arr.Length;i++)
            {
                arr[i] = n % 10;
                n = n / 10;
                Console.Write("{0}", arr[i]);
            }
        }

    }
}
