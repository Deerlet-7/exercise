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
    public partial class myy : Form
    {
        public myy()
        {
            InitializeComponent();
        }

        private void 取消预约ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            string Id, Name;
            Id = dataGridView1.SelectedCells[0].Value.ToString();
            Name = dataGridView1.SelectedCells[1].Value.ToString();
            string sql = "delete from Yy where Id='" + Id + "'and Name='" + Name + "'";
            Dao1 dao = new Dao1();
            MessageBox.Show("取消成功");
            dao.Execute(sql);


        }

        private void 刷新ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            myy y = new myy();
            y.Show();
            this.Hide();
        }


        private void 返回ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            StuDenglu1 student = new StuDenglu1();
            student.Show();
            this.Hide();
        }
        private void table()
        {
            dataGridView1.Rows.Clear();
            string sql = "select*from Yy ";
            Dao1 dao = new Dao1();
            IDataReader dr = dao.read(sql);


            while (dr.Read())
            {
                string a, b, c, d, e,f;
                dr.Read();
                a = dr["Id"].ToString();
                b = dr["Name"].ToString();
                c = dr["Date"].ToString();
                d = dr["Sjd"].ToString();
                e = dr["Classid"].ToString();
                f = dr["Sh"].ToString();
                string[] str = { a, b, c, d, e ,f};
                dataGridView1.Rows.Add(str);
            }
            dr.Close();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (textBox1.Text == "" || textBox2.Text == "")
            {
                MessageBox.Show("学号和姓名不能为空，请重新输入！");
            }
            else
            {
                string sql = "select *from Yy where Id='" + textBox1.Text + "'and Name='" + textBox2.Text + "'";
                Dao1 dao = new Dao1();
                IDataReader dr = dao.read(sql);
                if (dr.Read())
                {
                    table();
                }
                else
                {
                    MessageBox.Show("没有查询到信息，请检查后重新输入", "提示", MessageBoxButtons.OK, MessageBoxIcon.Warning);

                }
            }
        }
    }
}
