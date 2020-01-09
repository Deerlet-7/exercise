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
    public partial class StuDenglu1 : Form
    {
        public StuDenglu1()
        {
            InitializeComponent();
            toolStripStatusLabel1.Text = DateTime.Now.ToString("yyyy-MM-dd  HH:mm:ss");
            timer1.Start();
            Table();
        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            toolStripStatusLabel1.Text = DateTime.Now.ToString("yyyy-MM-dd  HH:mm:ss");
        }

        private void dataGridView1_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {

        }
        private void Table()
        {
            string sql = "select*from class";
            Dao1 dao = new Dao1();
            IDataReader dr = dao.read(sql);
            while (dr.Read())
            {
                string a, b, c;
                a = dr["Date"].ToString();
                b = dr["Sjd"].ToString();
                c = dr["Id"].ToString();
                string[] str = { a, b, c };
                dataGridView1.Rows.Add(str);
            }
            dr.Close();

        }

        private void 选择预约ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Yy y = new Yy();
            y.ShowDialog();
            this.Hide();
        }

        private void 查看预约ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            myy y = new myy();
            y.ShowDialog();
            this.Hide();
        }

        private void 退出ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Form1 form = new Form1();
            form.Show();
            this.Hide();
        }

        private void 返回ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            StuDenglu1 studenglu = new StuDenglu1();
            studenglu.Show();
            this.Hide();
        }
    }
}

