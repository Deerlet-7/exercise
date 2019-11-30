using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Test3_2_2
{
    class Card    //Card类
    {
        long cardNo;   //卡号
        decimal balance;      //高精度的卡余额
        int currentNum;       //整数型的当前次数，表示当日业务实际发生笔数
        static int number;          //静态的整数型次数，表示每张卡允许当日存款或取款的总次数
        decimal[] currentMoney;     //存放当日存取款金额，整数代表存款，负数代表取款
        decimal m = 0;            //用来存放所有使用的金额数
        string password;
        public Card()         //Card的无参的构造函数
        {
            currentMoney = new decimal[number];
        }
        public Card(long No, decimal Balance, string Password)   //Card的有参的构造函数，参数为卡号以及余额
        {
            cardNo = No;
            balance = Balance;
            currentMoney = new decimal[number];
        }
        public void store(decimal Money, out int status)    //store方法，参数为钱数以及要进行的业务
        {
            if (currentNum == number)    //此卡已达当日允许的业务次数
            {
                status = 0;
                return;
            }
            if (balance + Money < 0)    //取款金额大于余额
            {
                status = -1;    //存款余额不足，不能完成本次业务
                return;
            }
            m = m + System.Math.Abs(Money);//Abs为取绝对值，取款与存款均不能超出5000，然后将每次交易后的金额累加
            if (m > 5000)    //如果交易金额数累计达到5000，则退出交易程序
            {
                status = 2;
                return;
            }
            currentMoney[currentNum] = Money;  //记录当日存取款金额
            balance += Money;     //更新当前余额
            currentNum++;      //业务数加一
            status = 1;       //成功完成当前业务
        }
        public void show()     //显示语句
        {
            Console.WriteLine("卡号：{0}，当前余额：{1}，当日发生业务的次数：{2}", cardNo, balance, currentNum);
            for (int i = 0; i < currentNum; i++)
            {
                Console.WriteLine("当前存款/取款的情况{0}", currentMoney[i]);
            }
        }
        static public int Number     //输入本卡当日允许业务的次数
        {
            set
            {
                number = value;
            }
        }
        public long CardNo    //输入卡号
        {
            get
            {
                return cardNo;
            }
        }
        public string Password
        {
            get
            {
                return password;
            }
        }
    }
    class Test3_2
    {
        static void Main(string[] args)
        {
            Test3_2 T = new Test3_2();    //创建Test3_2的T的实例对象
            Card[] person;          //创建一个person[]数组，是Card类型的
            int Num, status, k;     //Num是储蓄卡总数，Status是状态，为0表示此卡今天已经到达今日允许最大次数，为1表示存款，为-1表示取款，
            long CardNo;       //卡号
            string Password = null;
            decimal Balance, Money;   //余额，本次交易额
            Console.Write("请输入允许当日存款或取款的总次数：");      //输入允许当日存款或取款的总次数 
            string sline = Console.ReadLine();
            Card.Number = int.Parse(sline);
            Console.Write("请输入某银行发出的储蓄卡总数：");    //输入某银行发出的储蓄卡总数
            sline = Console.ReadLine();
            Num = int.Parse(sline);
            person = new Card[Num];     //人数为卡数
            for (int i = 0; i < Num; i++)  //输入卡号与余额，并输出
            {
                Console.Write("请输入卡号：");
                sline = Console.ReadLine();
                CardNo = long.Parse(sline);
                Console.Write("请输入{0}  账户余额：", CardNo);
                sline = Console.ReadLine();
                Balance = decimal.Parse(sline);
                person[i] = new Card(CardNo, Balance, Password);
            }
            while (true)
            {
                Console.WriteLine("现在正进行存款取款的业务处理，如果输入的卡号<0，则结束业务处理");
                Console.Write("请输入卡号：");   //输入卡号
                sline = Console.ReadLine();
                CardNo = long.Parse(sline);
                if (CardNo < 0)    //如果卡号为负数，则退出
                    break;
                k = T.Locate(person, CardNo);   //k为办卡人
                if (k == -1)    //如果k为负，则表示不存在这张卡
                {
                    Console.WriteLine("对不起，不存在{0}号的储蓄卡", CardNo);
                    continue;
                }
                Console.WriteLine("请输入密码");   //控制台提示"请输入密码"
                ConsoleKeyInfo ck = Console.ReadKey(true);  // Console.ReadKey(true)是等待用户按下任意键，一次读入一个字符，布尔类型的参数控制是否在控制台上显示用户按下的按键，true参数，使用户按下的按键不显示在控制台上，在控制台上显示你想让它显示的*号
                while (ck.Key != ConsoleKey.Enter)  //判断用户是否按下Enter键
                {
                    Console.WriteLine("*");    //将每一个字符用*号代替
                    Password += ck.KeyChar;
                    ck = Console.ReadKey(true);
                }
                if (Password.Equals("123456") == false)  //如果用户输入的密码不等于他设定的密码
                {
                    Console.WriteLine("密码错误，请重新输入密码：");   //控制台提醒"密码错误，请重新输入密码："
                    break;
                }
                Console.WriteLine("请输入卡金额（正值代表存款，负值代表取款）：");  //输入卡金额（正数表示存款，负数代表取款）
                sline = Console.ReadLine();
                Money = decimal.Parse(sline);
                person[k].store(Money, out status);      //调用person的store方法，输出status
                switch (status)      // status代表不同的状态
                {
                    case -1:
                        Console.WriteLine("存款余额不足，不能完成本次的取款业务"); //-1时，表示余额不足，不能完成本次业务
                        break;
                    case 0:
                        Console.WriteLine("本卡已达当日允许的业务次数");//为0时，表示本卡已达当日允许的业务次数
                        break;
                    case 1:
                        Console.WriteLine("成功处理完当前业务");//为1时，表示成功处理完当前业务，并输出卡号，当前余额，当日发生业务的次数，以及当前存款/取款的情况
                        person[k].show();
                        break;
                    case 2:
                        Console.WriteLine("当日交易金额数已达5000，请明日再来");//为2时，表示当日交易金额数已达5000，请明日再来
                        break;
                }
            }
        }
        int Locate(Card[] person, long cardNo)   //Locate方法，卡号以及对应的办卡人，返回办卡人总数
        {
            int index = -1;
            for (int i = 0; i < person.Length; i++)
            {
                if (person[i].CardNo == cardNo)
                {
                    index = i;
                }
            }
            return index;
        }
    }

}
