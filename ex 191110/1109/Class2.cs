using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _1109
{
    class Class2
    {
        static void Main(string[] args)
        {
             double sum = 0.5, t, t1, t2, t3, p = 0.5 * 0.5;
            int odd = 1, even = 2;
            t = t1 = t2 = 1.0;t3 = 0.5;
            while (t > 1e-10)
            {
                t1 = t1 * odd / even;
                odd += 2;even += 2;
                t2 = 1.0 / odd;
                t3 = t3*p;
                t = t1*t2*t3;
                sum += t;
            }
            Console.WriteLine("\nPI={0,10:f8}", sum * 6);
            Console.Write("输入所求半径");
            string input = Console.ReadLine();//readline()读入的为字符串形式
            int r = Convert.ToInt32(input);//对input进行强转
            double PAI = sum * 6;
            double squ = PAI * r * r;
            Console.WriteLine("面积为{0}", squ);
        }
    }
}
