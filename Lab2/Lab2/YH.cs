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
    public partial class YH : Form
    {
        public YH()
        {
            InitializeComponent();
            Table();
        }
        private void Table()
        {
            string sql = "select*from   YH";
            Dao1 dao = new Dao1();
            IDataReader dr = dao.read(sql);
            while (dr.Read())
            {
                string a, b, c;
                a = dr["Name"].ToString();
                b = dr["Password"].ToString();
                c = dr["Sf"].ToString();
                string[] str = { a, b, c };
                dataGridView1.Rows.Add(str);
            }
            dr.Close();
        }

        private void 删除账号ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            string Name, Password;
            Name = dataGridView1.SelectedCells[0].Value.ToString();
            Password = dataGridView1.SelectedCells[1].Value.ToString();
            string sql = "delete from YH where Name='" + Name + "'and Password='" + Password + "'";
            Dao1 dao = new Dao1();
            MessageBox.Show("删除成功!");
            dao.Execute(sql);
        }

       

        private void 返回ToolStripMenuItem_Click(object sender, EventArgs e)
        {

        }
        private void 刷新ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            YH yh = new YH();
            yh.Show();
            this.Hide();
        }

        private void YH_FormClosed(object sender, FormClosedEventArgs e)
        {
            Application.Exit();
        }

        private void 添加账号ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Zhanghao zhanghao = new Zhanghao();
            zhanghao.Show();
            this.Hide();
        }

        private void 刷新ToolStripMenuItem_Click_1(object sender, EventArgs e)
        {

        }

        private void 返回ToolStripMenuItem_Click_1(object sender, EventArgs e)
        {
            AdminDenglu1 admindenglu = new AdminDenglu1();
            admindenglu.Show();
            this.Hide();
        }
    }
}
