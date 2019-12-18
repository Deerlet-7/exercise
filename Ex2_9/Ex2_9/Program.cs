using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex2_9
{
    class Program
    {
        static void Main(string[] args)
        {
            string s = Console.ReadLine();
            int left = 0;
            int right = s.Length - 1;
            while (left < right)
            {
                if (s[left] == s[right])
                {
                    left += 1;
                    right -= 1;
                }
                else
                {
                    break;
                }
            }
            if (left >= right)
            {
                Console.WriteLine("true");
            }
            else
            {
                Console.WriteLine("false");
            }
        }
    }
}
