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
    public partial class Yy : Form
    {
        public Yy()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (textBox1.Text == null || textBox2.Text == null || textBox3.Text == null || textBox3.Text == null || comboBox1.Text == null)
            {
                MessageBox.Show("输入不完整，请重新输入", "提示", MessageBoxButtons.OK, MessageBoxIcon.Warning);
            }
            string sql = "insert into Yy values('" + textBox1.Text + "','" + textBox2.Text + "','" + textBox3.Text + "','" + comboBox1.Text + "','" + comboBox2.Text + "','')";
            Dao1 dao = new Dao1();
            int i = dao.Execute(sql);
            if (i > 0)
            {
                MessageBox.Show("预约成功！");
                StuDenglu1 studenglu = new StuDenglu1();
                studenglu.Show();
                this.Hide();
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {

            textBox1.Text = null;
            textBox2.Text = null;
            textBox3.Text = null;
            comboBox1.Text = null;
            comboBox2.Text = null;
            StuDenglu1 studenglu = new StuDenglu1();
            studenglu.Show();
            this.Hide();
        }
    }
}
