using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex2_8
{
    class Program
    {
		//
        static void Main(string[] args)
        {
            int[] a = new int[] { 6, 8, 3, 5, 24, 5, 65, 33 };
            judge(a);
        }
        static void judge(int[] a)
        {
            int max = 0;
            int index = 0;
            for(int i =0; i < a.Length-1; i++)
            {
                if (a[i] > a[i + 1])
                {
                    max = a[i];
                    index = i;
                }
            }
            Console.WriteLine("max:{0},index:{1}", max, index);
        }
    }
}
