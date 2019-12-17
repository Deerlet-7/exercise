using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex2_2
{
    class Program
    {
        static void Main(string[] args)
        {
            string s = Console.ReadLine();
            int n = Convert.ToInt32(s);
            int y = fun(n);
            Console.WriteLine("n={0} y={1}", n,y);
        }
        static int fun(int n)
        {
            int ret = 1;
            int sum = 0;
            for (int i = n;i>0;i--)
            {
                int j = i;
                ret = 1;
                while (j!=1)
                {
                    ret = ret * j;
                    j--;
                }
                sum += ret;
            }
            return sum;
        }
    }
}
