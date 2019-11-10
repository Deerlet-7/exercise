using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ex_191110_3_
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.Write("请输入一个四位整数");
            string s = Convert.ToString(Console.Read());
            //int num = Convert.ToInt32(s);
            int num;
            ASCIIEncoding ascii = new ASCIIEncoding();
            byte[] bytestr = ascii.GetBytes(s);
            for (Byte l = 0; l < 4; l++)                   //遍历这个数组里的内容
            {
                if (bytestr[l] < 48 || bytestr[l] > 57)                          //判断是否为数字
                {
                    Console.WriteLine("有字符");
                }
                Console.Read();
            }
            num = Convert.ToInt32(s);
            int[] each = new int[4];
            int max, min, i, j, tmpe;
            while (num != 6174 && num != 0)
            {
                i = 0;
                while (num != 0)
                {
                    each[i++] = num % 10;
                    num = num / 10;
                }

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
