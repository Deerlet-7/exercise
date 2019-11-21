using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ex_191110_3_
{
    class Program
    {
        public static bool testInput(string s)
        {
            for (int i = 0; i < s.Length; i++)
            {
                if (!char.IsNumber(s[i]))
                    return false;
            }
            return true;
        }
        //卡布列克运算
        static void Main(string[] args)
        {
            Console.Write("请输入一个四位整数");
            string s = Console.ReadLine();
            char[] array = new char[s.Length];
            for (int x = 0; x < s.Length; x++)
            {
                array[x] = s[x];
            }
            while (!testInput(s))
            {
                Console.WriteLine("输入错误，请重新输入一个四位数整数：");
                s = Console.ReadLine();
            }
            int num = Convert.ToInt32(s);
            int[] each = new int[4];
            int max, min, i, j, tmpe;
            while (num != 6174 && num != 0)
            {
                i = 0;
                //得到每一位，放进数组里
                while (num != 0)
                {
                    each[i++] = num % 10;
                    num = num / 10;
                }

                //对数组进行排序
                for (i = 0; i < 3; i++)
                {
                    for (j = 0; j < 3 - i; j++)
                    {
                        if (each[j] > each[j + 1])
                        {
                            tmpe = each[j];
                            each[j] = each[j + 1];
                            each[j + 1] = tmpe;
                        }
                    }
                }
                min = 1000 * each[0] + 100 * each[1] + 10 * each[2] + 1 * each[3];
                max = 1000 * each[3] + 100 * each[2] + 10 * each[1] + 1 * each[0];
                num = max - min;
                Console.WriteLine("{0}-{1}={2}", max, min, num);
            }
            Console.Read();
        }
    }
    }
