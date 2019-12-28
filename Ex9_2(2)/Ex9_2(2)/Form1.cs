﻿using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Data.SqlClient;
 
namespace Ex9_2_2_
{
    public partial class Form1 : Form
    {
        string strcon = @"server=localhost;User Id=root;password=njnu123456;database=XSCJDB;Character Set=utf8";
        public Form1()
        {
            InitializeComponent();
            btnSearch_Click(null, null);
        }

        private void btnInsert_Click(object sender, EventArgs e)
        {
            using (MySqlConnection sqlcon = new MySqlConnection(strcon))
            //创建MySQL连接
            {
                sqlcon.Open();
                string sql = "SELECT XH As 学号, XM As 姓名, XB As 性别, CSRQ As 出生日期, ZY As 专业, ZXF As 学分 FROM XSB";	//这里为了在数据表格中显示中文列标题,于SQL语句中使用As关键字
                MySqlCommand command = new MySqlCommand(sql, sqlcon);
                //创建MySQL命令
                myda = new MySqlDataAdapter(command);
                //以命令作为参数创建MySQL适配器
                myst.Tables.Clear();
                myda.Fill(myst, "XSB");
                dgvAllStu.DataSource = myst.Tables["XSB"];
            }
        }

        private void btnSearch_Click(object sender, EventArgs e)
        {
            MySqlConnection sqlcon = new MySqlConnection(strcon);		//创建MySQL连接
            try
            {
                string stuID = txtStuID.Text.Trim();
                string stuName = txtName.Text.Trim();
                string stuXB;
                if (RbtnMale.Checked)
                {
                    stuXB = "男";
                }
                else
                {
                    stuXB = "女";
                }
                string stuBirthday = dateTimePicker1.Value.ToShortDateString().Split(' ')[0];
                string stuMajor = txtMajor.Text.Trim();
                string stuCredit = txtCredit.Text.Trim();
                MySqlCommand command = new MySqlCommand();		//创建MySQL命令
                command.CommandText = "INSERT INTO XSB(XH,XM,XB,CSRQ,ZY,ZXF) VALUES('" + stuID + "','" + stuName + "','" + stuXB + "','" + stuBirthday + "','" + stuMajor + "','" + stuCredit + "')";
                command.CommandType = CommandType.Text;
                command.Connection = sqlcon;
                sqlcon.Open();
                myda = new MySqlDataAdapter(command);
                myda.Fill(myst, "XSB");
                MessageBox.Show("插入成功！", "消息", MessageBoxButtons.OK);
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
            finally
            {
                sqlcon.Close();
            }
        }
    }
}
