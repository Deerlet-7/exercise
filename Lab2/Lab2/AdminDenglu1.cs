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
    public partial class AdminDenglu1 : Form
    {

        public AdminDenglu1()
        {
            InitializeComponent();
            toolStripStatusLabel1.Text = DateTime.Now.ToString("yyyy-MM-dd  HH:mm:ss");

        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            toolStripStatusLabel1.Text = DateTime.Now.ToString("yyyy-MM-dd  HH:mm:ss");
        }

        private void AdminDenglu1_Load(object sender, EventArgs e)
        {

        }


        private void AdminDenglu1_FormClosed(object sender, FormClosedEventArgs e)
        {
            Application.Exit();//结束程序
        }

        private void 退出ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            AdminDenglu1 admindenglu = new AdminDenglu1();
            admindenglu.Show();
            this.Hide();//结束程序
        }

        private void 查看实验室ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Sysgl sysgl = new Sysgl();
            sysgl.Show();

        }

        private void 添加账号ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Zhanghao zhanghao = new Zhanghao();
            zhanghao.Show();
            this.Hide();
        }

        private void 查看账号ToolStripMenuItem_Click(object sender, EventArgs e)
        {

            //   string sql = "select*from YH";
            // Dao dao = new Dao();
            // IDataReader dr = dao.read(sql);
            //while (dr.Read())
            // {
            //  string a, b, c;
            // a = dr["Name"].ToString();
            //  b = dr["Password"].ToString();
            //  c = dr["Sf"].ToString();
            //  string[] str = { a, b, c, };
            // dataGridView1.Rows.Add(str);
            //   }
            // dr.Close();
            YH yh = new YH();
            yh.Show();
            this.Hide();


        }

        private void 删除账号ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            YH yh = new YH();
            yh.Show();
            this.Hide();

        }

        private void 返回ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Form1 form = new Form1();
            form.Show();
            this.Hide();
        }

        private void 添加实验室ToolStripMenuItem_Click(object sender, EventArgs e)

        {
            Tj tj = new Tj();
            tj.Show();

        }

        private void 账号管理ToolStripMenuItem_Click(object sender, EventArgs e)
        {

        }
    }
}

