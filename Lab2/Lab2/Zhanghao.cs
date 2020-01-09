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
    public partial class Zhanghao : Form
    {
        public Zhanghao()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (textBox1.Text == null || textBox2.Text == null || comboBox1.Text == null)
            {
                MessageBox.Show("输入不完整，请重新输入", "提示", MessageBoxButtons.OK, MessageBoxIcon.Warning);
            }
            string sql = "insert into YH values('" + textBox1.Text + "','" + textBox2.Text + "','" + comboBox1.Text + "')";
            Dao1 dao = new Dao1();
            int i = dao.Execute(sql);
            if (i > 0)
            {
                MessageBox.Show("添加成功！");
                this.Hide();
                AdminDenglu1 admindenglu = new AdminDenglu1();
                admindenglu.Show();
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {
            textBox1.Text = null;
            textBox2.Text = null;
            comboBox1.Text = null;
            AdminDenglu1 admindenglu = new AdminDenglu1();
            admindenglu.Show();
            this.Hide();
        }
    }
}
