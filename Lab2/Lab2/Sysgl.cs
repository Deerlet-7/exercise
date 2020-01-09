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
    public partial class Sysgl : Form
    {
        public Sysgl()
        {
            InitializeComponent();
            Table();
        }

        private void 添加实验室ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Tj tj = new Tj();
            tj.Show();
        }

        private void 删除实验室ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            string Sjd, Date, Id;
            Date = dataGridView1.SelectedCells[0].Value.ToString();
            Sjd = dataGridView1.SelectedCells[1].Value.ToString();
            Id = dataGridView1.SelectedCells[2].Value.ToString();
            string sql = "delete from class where Date='" + Date + "'and Sjd='" + Sjd + "'and Id='" + Id + "'";
            Dao1 dao = new Dao1();
            MessageBox.Show("删除成功");
            dao.Execute(sql);


        }
        private void Table()
        {
            dataGridView1.Rows.Clear();
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

        private void 刷新ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Sysgl sysgl = new Sysgl();
            sysgl.Show();
            this.Hide();
        }
    }
}