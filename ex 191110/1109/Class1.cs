using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _1109
{
    class Class1
    {
        static void Main2(string[] args)
        {
            //求Π
            double sum = 0.5, t, t1, t2, t3, p = 0.5 * 0.5;
            int odd = 1, even = 2;
            t = t1 = t2 = 1.0; t3 = 0.5;
            do
            {
                t1 = t1 * odd / even;
                odd += 2; even += 2;
                t2 = 1.0 / odd;
                t3 = t3 * p;
                t = t1 * t2 * t3;
                sum += t;
            } while (t > 1e-10);
            Console.WriteLine("\nPI={0,10:f8}", sum * 6);
            Console.Read();
        }
    }
}
