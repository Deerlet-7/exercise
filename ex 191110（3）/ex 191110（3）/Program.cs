using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ex_191110_3_
{
    class Program
    {
        static void show()
        {
            Console.WriteLine("有字符");//
            Console.Read();
        }
        static void Main(string[] args)
        {
            Console.Write("请输入一个四位整数");
            String[] str = new String[4];
            int k = 0;
            Char  s = Convert.ToChar(Console.Read());
            for (k = 0;k < str.Length; k++)
            {
                str[k] =Convert.ToString(s);
            }
            int l = 0;
            for(l = 0; l < str.Length; l++)
            {
                if (Convert.ToChar(str[l]) < '0' || Convert.ToChar(str[l]) > '9')
                {
                    show();
                    break;
                }
            }
            int num = Convert.ToInt32(str);
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
