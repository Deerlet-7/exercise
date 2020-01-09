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
    public partial class TeaDenglu1 : Form
    {
        public TeaDenglu1()
        {
            InitializeComponent();
        }

        private void 退出ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Form1 form = new Form1();
            form.Show();
            this.Hide();
        }

        private void 查看预约ToolStripMenuItem_Click(object sender, EventArgs e)
        {

            Table();


        }
        private void Table()
        {
            dataGridView1.Rows.Clear();
            string sql = "select*from Yy";
            Dao1 dao = new Dao1();
            IDataReader dr = dao.read(sql);
            while (dr.Read())
            {
                string a, b, c, d, o;
                a = dr["Id"].ToString();
                b = dr["Name"].ToString();
                c = dr["Date"].ToString();
                d = dr["Sjd"].ToString();
                o = dr["Classid"].ToString();
                string[] str = { a, b, c, d, o };
                dataGridView1.Rows.Add(str);

            }
            dr.Close();
        }

        private void 审核预约ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            ShenHe shenhe = new ShenHe();
            shenhe.Show();
            this.Hide();
        }
        private void 返回ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            TeaDenglu1 teadenglu = new TeaDenglu1();
            teadenglu.Show();
            this.Hide();
        }

        private void 查看实验室ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Sys sys = new Sys();
            sys.Show();

        }
    }
}
