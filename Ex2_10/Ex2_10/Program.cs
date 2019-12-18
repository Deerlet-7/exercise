using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex2_10
{
    class Program
    {
        static void Main(string[] args)
        {
            int count1 = 0;
            int count2 = 0;
            int sum = 0;
            int[] arr = new int[] { 1, 4, -6, 6, 7, -2, 4, -3, 9, 0 };
            for(int i = 0;i<arr.Length;i++)
            {
                sum += arr[i];
                if (arr[i] > 0)
                {
                    count1++;
                }
                if (arr[i]<0)
                {
                    count2++;
                }
            }
            int adv = sum / arr.Length;
            Console.WriteLine("正数{0}个，负数{1}个，平均值{2}", count1, count2, adv);
        }
    }
}
