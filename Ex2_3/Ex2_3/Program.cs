using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex2_3
{
    class Program
    {
        static void Main(string[] args)
        {
            for(int i = 100;i<1000;i++)
            {
                int j = i;
                int sum = 0;
                while(j!=0)
                {
                    int n = j % 10;
                    j = j / 10;
                    sum += n * n * n;
                }
                if(sum == i)
                {
                    Console.WriteLine("{0}", i);
                }
            }
        }
    }
}
