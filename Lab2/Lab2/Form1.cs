using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Lab2
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void timer1_Tick(object sender, EventArgs e)
        {

            if (comboBox1.Text == "学生")
            {
                StuDenglu1 studenglu = new StuDenglu1();
                studenglu.Show();
                this.Hide();
            }

            if (comboBox1.Text == "老师")
            {
                TeaDenglu1 teadenglu = new TeaDenglu1();
                teadenglu.Show();
                this.Hide();

            }

            if (comboBox1.Text == "管理员")
            {
                AdminDenglu1 admindenglu = new AdminDenglu1();
                admindenglu.Show();
                this.Hide();
            }


            timer1.Stop();


        }

        //登录事件
        private void button1_Click(object sender, EventArgs e)
        {
            if (login())
            {
                timer1.Start();
                textBox1.Visible = false;
                textBox2.Visible = false;
                comboBox1.Visible = false;
                button1.Visible = false;
                button2.Visible = false;
                label1.Visible = false;
                label2.Visible = false;
                label3.Visible = false;

            }
        }
        private bool login()
        {
            if (textBox1.Text == "" || textBox2.Text == "" || comboBox1.Text == "")
            {
                MessageBox.Show("输入不完整或者错误，请重新输入", "提示", MessageBoxButtons.OK, MessageBoxIcon.Warning);
                return false;
            }

            if (comboBox1.Text == "学生")
            {
                string sql = "select *from student where Name='" + textBox1.Text + "'and Password='" + textBox2.Text + "'";
                Dao1 dao = new Dao1();
                IDataReader dr = dao.read(sql);
                if (dr.Read())
                {
                    return true;
                }
                else
                {
                    MessageBox.Show("输入有误，请检查后重新输入", "提示", MessageBoxButtons.OK, MessageBoxIcon.Warning);
                    return false;

                }

            }
            if (comboBox1.Text == "老师")
            {
                string sql = "select *from Teacher where Name='" + textBox1.Text + "'and Password='" + textBox2.Text + "'";
                Dao1 dao = new Dao1();
                IDataReader dr = dao.read(sql);
                if (dr.Read())
                {
                    return true;
                }
                else
                {
                    MessageBox.Show("输入有误，请检查后重新输入", "提示", MessageBoxButtons.OK, MessageBoxIcon.Warning);
                    return false;
                }
            }
            if (comboBox1.Text == "管理员")
            {
                if (textBox1.Text == "admin" && textBox2.Text == "123456")
                {
                    return true;
                }
                else
                {
                    MessageBox.Show("输入有误，请检查后重新输入", "提示", MessageBoxButtons.OK, MessageBoxIcon.Warning);
                    return false;
                }
            }
            return false;
        }

        private void button2_Click(object sender, EventArgs e)
        {
            textBox1.Text = null;
            textBox2.Text = null;
            comboBox1.Text = null;
        }

        private void Form1_FormClosed(object sender, FormClosedEventArgs e)
        {
            Application.Exit();//结束程序
        }
    }
}
