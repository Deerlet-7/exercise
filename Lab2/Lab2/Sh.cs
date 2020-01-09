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
    public partial class Sh : Form
    {
        string[] str = new string[5];
        public Sh()
        {
            InitializeComponent();
        }
        public Sh(string[] t)
        {
            InitializeComponent();
            for (int i = 0; i < 5; i++)
            {
                str[i] = t[i];
            }
            textBox1.Text = str[0];
            textBox2.Text = str[1];
            textBox3.Text = str[2];
            comboBox1.Text = str[3];
            textBox4.Text = str[4];
        }

        private void button1_Click(object sender, EventArgs e)
        {
            string sql = "update Yy set Sh='" + comboBox2.Text + "'where Sjd='" + str[3] + "'";
            Dao1 dao = new Dao1();
            dao.Execute(sql);
            this.Hide();
            ShenHe shenhe = new ShenHe();
            shenhe.Show();

        }
    }
}
