using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Test3_1
{
    class Card
    {
        private string title, author; 
        private int total; 
        public Card() 
        {
            title = "";  
            author = ""; 
            total = 0;
        }
        public Card(string title, string author, int total) 
        {
            this.title = title;  
            this.author = author;
            this.total = total;
        }
        public void store(ref Card card)  
        {
            title = card.title;
            author = card.author;
            total = card.total;
        }
        public void show()  
        {
            Console.WriteLine("Title:{0},Author:{1},Total:{2}", title, author, total);
        }
        public string Title 
        {
            get { return title; }
            set { title = value; } 
        }
        public string Author   
        {
            get { return author; }
            set { author = value; } 
        }
        public int Total 
        {
            get { return total; }
            set { total = value; }
        }
    }
    class Test3_1 
    {
        static void Main(string[] args)
        {
            Test3_1 T = new Test3_1();
            Card[] books; 
            int[] index; 
            int i, k;    
            Card card = new Card(); 
            Console.Write("请输入需要入库图书的总数：");
            string sline = Console.ReadLine(); 
            int num = int.Parse(sline);
            books = new Card[num]; 
            for (i = 0; i < num; i++)
                books[i] = new Card();
            index = new int[num]; 
            for (i = 0; i < num; i++) 
            {
                Console.Write("请输入书名：");
                card.Title = Console.ReadLine();
                Console.Write("请输入作者：");
                card.Author = Console.ReadLine();
                Console.Write("请输入入库量：");
                sline = Console.ReadLine();
                card.Total = int.Parse(sline);
                books[i].store(ref card);
                index[i] = i;   
            }
            Console.Write("请选择什么关键字排序（1.按书名，2.按作者，3.按入库量）");
            sline = Console.ReadLine();
            int choice = int.Parse(sline);   
            T.sort(books, index, choice); 
            for (i = 0; i < num; i++)
            {
                k = index[i];
                (books[k]).show();
            }
            Console.Read();
        }
        void sort(Card[] book, int[] index, int method)
        {
            int i, j, m, n, temp;
            switch (method)
            {
                case 1:
                    for (m = 0; m < index.Length - 1; m++)
                        for (n = 0; n < index.Length - 1; n++)
                        {
                            i = index[n];          
                            j = index[n + 1]; 
                            if (string.Compare(book[i].Title, book[j].Title) > 0) 
                            {
                                temp = index[n];
                                index[n] = index[n + 1];
                                index[n + 1] = temp;
                            }
                        }
                    break;
                case 2:
                    for (m = 0; m < index.Length - 1; m++)
                        for (n = 0; n < index.Length - 1; n++)
                        {
                            i = index[n];         
                            j = index[n + 1];
                            if (string.Compare(book[i].Author, book[j].Author) > 0)  
                            {
                                temp = index[n];
                                index[n] = index[n + 1];
                                index[n + 1] = temp;
                            }
                        }
                    break;
                case 3:
                    for (m = 0; m < index.Length - 1; m++)
                        for (n = 0; n < index.Length - 1; n++)
                        {
                            i = index[n];   
                            j = index[n + 1];  
                            if (book[i].Total > book[j].Total)  
                            {
                                temp = index[n];
                                index[n] = index[n + 1];
                                index[n + 1] = temp;
                            }
                        }
                    break;
            }
        }
    }

}
