using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WinForm
{
    public partial class MainForm : Form
    {
        public MainForm()
        {
            InitializeComponent();
        }

        private void 新建NToolStripMenuItem_Click(object sender, EventArgs e)
        {
            ChildForm MDIChild = new ChildForm();
            MDIChild.MdiParent = this;
            MDIChild.Show();
        }

        private void 窗口ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Form activeChild = this.ActiveMdiChild;
            if(activeChild != null)
            {
                try
                {
                    RichTextBox theBox = (RichTextBox)activeChild.ActiveControl;
                    if(theBox != null)
                    {
                        Clipboard.SetDataObject(theBox.SelectedText);
                    }
                }
                catch
                {
                    MessageBox.Show("you need to select a RichTextBox");
                }
            }
        }
    }
}
