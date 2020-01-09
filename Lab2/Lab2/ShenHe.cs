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
    public partial class ShenHe : Form
    {
        public ShenHe()
        {
            InitializeComponent();
            table();
        }

        private void table()
        {
            dataGridView1.Rows.Clear();
            string sql = "select*from Yy";
            Dao1 dao = new Dao1();
            IDataReader dr = dao.read(sql);
            while (dr.Read())
            {
                string a, b, c, d, e;
                a = dr["Id"].ToString();
                b = dr["Name"].ToString();
                c = dr["Date"].ToString();
                d = dr["Sjd"].ToString();
                e = dr["Classid"].ToString();
                string[] str = { a, b, c, d, e };
                dataGridView1.Rows.Add(str);
            }
            dr.Close();
        }

        private void 审核ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            string[] str = { dataGridView1.SelectedCells[0].Value.ToString(), dataGridView1.SelectedCells[1].Value.ToString(), dataGridView1.SelectedCells[2].Value.ToString(), dataGridView1.SelectedCells[3].Value.ToString(), dataGridView1.SelectedCells[4].Value.ToString() };
            Sh sh = new Sh(str);
            sh.Show();
            this.Hide();
        }

        private void 返回ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            TeaDenglu1 teadenglu = new TeaDenglu1();
            teadenglu.Show();
            this.Hide();
        }
    }
}