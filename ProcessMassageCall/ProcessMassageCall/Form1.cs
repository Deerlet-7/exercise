﻿using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ProcessMassageCall
{

    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {

        }
        public partial class Form1 : Form
        {
            private delegate void WriteTextBox(char ch);                    // 定义委托
            private WriteTextBox writeTextBox;                      // 声明委托
            public Form1()
            {
                InitializeComponent();
            }
            private void button1_Click(object sender, EventArgs e)
            {
                if (checkBox1.Checked == true)
                {
                    groupBox2.Text = "运行中…";
                    groupBox2.Refresh();
                    textBox1.Clear();
                    textBox1.Refresh();
                    writeTextBox = new WriteTextBox(WriTextBox1);       // 实例化委托
                    WriTxt(writeTextBox);                       // 作为参数
                    groupBox2.Text = "任务1";
                    textBox3.Focus();
                    textBox3.SelectAll();
                }
                if (checkBox2.Checked == true)
                {
                    groupBox2.Refresh();
                    groupBox3.Text = "运行中…";
                    groupBox3.Refresh();
                    textBox2.Clear();
                    textBox2.Refresh();
                    writeTextBox = new WriteTextBox(WriTextBox2);       // 实例化委托
                    WriTxt(writeTextBox);                       // 作为参数
                    groupBox3.Text = "任务2";
                    textBox3.Focus();
                    textBox3.SelectAll();
                }
            }
            private void WriTxt(WriteTextBox wMethod)
            {
                string strdata = textBox3.Text;
                for (int i = 0; i < strdata.Length; i++)
                {
                    wMethod(strdata[i]);                            // 使用委托
                                                                    // 间歇延时
                    DateTime now = DateTime.Now;
                    while (now.AddSeconds(1) > DateTime.Now) { }
                }
            }
            private void WriTextBox1(char ch)
            {
                textBox1.AppendText(ch + "\r");
            }
            private void WriTextBox2(char ch)
            { 
                textBox2.AppendText(ch + "\r");
            }
        }

    }
}
