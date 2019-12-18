using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


namespace Ex2_12
{
    class Program
    {
        static void Main(string[] args)
        {
            string s = Console.ReadLine();
            int i = 0;
            int j = 0;
            int sum = 0;
            int[] a = new int[20];
            int count = 0;
            int k = 0;
            int[] b = new int[20];
            while (i < s.Length)
            {
                char ch = Convert.ToChar(s[i]);
                if(ch > 47 && ch < 58)
                {
                    a[j] = Convert.ToInt32(ch);
                    j++;
                    while (a[j] != 0)
                    {
                        count++;
                        j++;
                    }
                }
                else
                {
                    if (j != 0)
                    {
                        for (j = 0; j < count; j++)
                        {
                            sum += Convert.ToInt32((a[j]) * Math.Pow(10.0, Convert.ToDouble( count - 1)));
                            count--;
                        }
                        b[k] = sum;
                        k++;
                    }
                    i++;
                    continue;
                }
                i++;
            }
            show(b);
            Console.Read();
        }
        static void show(int[] b)
        {
            foreach(int x in b)
            {
                Console.Write("{0}", x);
            }
        }
    }
}
