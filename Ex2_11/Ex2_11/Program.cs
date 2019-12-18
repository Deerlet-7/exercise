using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex2_11
{
    class Program
    {
        static void Main(string[] args)
        {
            int[,] arr = new int[4, 4] {{ 1, 2, 3, 4 },{ 2, 3, 4, 5 },{ 3, 4, 5, 6 },{ 4, 5, 6, 7 }};
            int sum = 0;
            int j = 3;
            for (int i = 0;i<4;i++)
            {
                while(j>=0)
                {
                    int a = arr[i, i];
                    int b = arr[i, j];
                    sum += a + b;
                    j--;
                    break;
                }
            }
            Console.WriteLine("{0}", sum);
            Console.Read();
        }
    }
}
