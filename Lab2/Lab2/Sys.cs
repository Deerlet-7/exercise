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
    public partial class Sys : Form
    {
        public Sys()
        {
            InitializeComponent();
            Table();
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

        private void 退出ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Application.Exit();//结束程序
        }
    }
}
