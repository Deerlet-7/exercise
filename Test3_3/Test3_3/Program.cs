using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Test3_3
{
    enum MothNname
    {
        January,February,March,April,May,June,July,Augest,September,October,Novemrber,December
    }
    class WhatDay
    {
        static System.Collections.ICollection DaysInMonths = new int[12] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        static System.Collections.ICollection DaysInMonths2 = new int[12] { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        static void Main(string[] args)
        {
            Console.WriteLine("请输入要判断的年份：");
            int yearNum = Convert.ToInt32(Console.ReadLine());
            bool isLeapYear = ((yearNum % 4 == 0 && yearNum % 100 != 0 )|| yearNum % 400 == 0);
            int maxDayNum = isLeapYear ? 366 : 365;
            try
            {
                Console.Write("Please input a day number between 1 and {0}:", maxDayNum);
                string line = Console.ReadLine();
                int dayNum = int.Parse(line);
                if(dayNum < 1 || dayNum > maxDayNum)
                {
                    throw new ArgumentOutOfRangeException("Day out of Range!");
                }
                int monthNum = 0;
                if (isLeapYear)
                {
                    foreach (int daysInMonth in DaysInMonths2)
                    {
                        if (dayNum <= daysInMonth)
                        {
                            break;
                        }
                        else
                        {
                            dayNum -= daysInMonth;
                            monthNum++;
                        }
                    }
                }
                else
                {
                    foreach (int daysInMonth in DaysInMonths)
                    {
                        if (dayNum <= daysInMonth)
                        {
                            break;
                        }
                        else
                        {
                            dayNum -= daysInMonth;
                            monthNum++;
                        }
                    }
                }
                MothNname temp = (MothNname)monthNum;
                string mothName = Enum.Format(typeof(MothNname), temp,"g");
                Console.WriteLine("{0}{1}", dayNum, mothName);
                Console.Read();
            }
            catch(Exception caught)
            {
                Console.WriteLine(caught);
            }
        }
    }
}
