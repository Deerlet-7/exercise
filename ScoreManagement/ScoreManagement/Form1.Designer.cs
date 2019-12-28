namespace ScoreManagement
{
    partial class Form1
    {
        /// <summary>
        /// 必需的设计器变量。
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// 清理所有正在使用的资源。
        /// </summary>
        /// <param name="disposing">如果应释放托管资源，为 true；否则为 false。</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows 窗体设计器生成的代码

        /// <summary>
        /// 设计器支持所需的方法 - 不要修改
        /// 使用代码编辑器修改此方法的内容。
        /// </summary>
        private void InitializeComponent()
        {
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Form1));
            this.menuStrip1 = new System.Windows.Forms.MenuStrip();
            this.toolStrip1 = new System.Windows.Forms.ToolStrip();
            this.学生信息ToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.学生成绩ToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.查询qToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.修改MToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.录入UToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.menuStrip1.SuspendLayout();
            this.SuspendLayout();
            // 
            // menuStrip1
            // 
            this.menuStrip1.ImageScalingSize = new System.Drawing.Size(24, 24);
            this.menuStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.学生信息ToolStripMenuItem,
            this.学生成绩ToolStripMenuItem});
            this.menuStrip1.Location = new System.Drawing.Point(0, 0);
            this.menuStrip1.Name = "menuStrip1";
            this.menuStrip1.Size = new System.Drawing.Size(628, 32);
            this.menuStrip1.TabIndex = 0;
            this.menuStrip1.Text = "menuStrip1";
            // 
            // toolStrip1
            // 
            this.toolStrip1.ImageScalingSize = new System.Drawing.Size(24, 24);
            this.toolStrip1.Location = new System.Drawing.Point(0, 32);
            this.toolStrip1.Name = "toolStrip1";
            this.toolStrip1.Size = new System.Drawing.Size(628, 25);
            this.toolStrip1.TabIndex = 1;
            this.toolStrip1.Text = "toolStrip1";
            // 
            // 学生信息ToolStripMenuItem
            // 
            this.学生信息ToolStripMenuItem.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.查询qToolStripMenuItem,
            this.修改MToolStripMenuItem});
            this.学生信息ToolStripMenuItem.Name = "学生信息ToolStripMenuItem";
            this.学生信息ToolStripMenuItem.Size = new System.Drawing.Size(111, 28);
            this.学生信息ToolStripMenuItem.Text = "学生信息(&I)";
            // 
            // 学生成绩ToolStripMenuItem
            // 
            this.学生成绩ToolStripMenuItem.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.录入UToolStripMenuItem});
            this.学生成绩ToolStripMenuItem.Name = "学生成绩ToolStripMenuItem";
            this.学生成绩ToolStripMenuItem.ShortcutKeys = ((System.Windows.Forms.Keys)((System.Windows.Forms.Keys.Control | System.Windows.Forms.Keys.U)));
            this.学生成绩ToolStripMenuItem.Size = new System.Drawing.Size(116, 28);
            this.学生成绩ToolStripMenuItem.Text = "学生成绩(&S)";
            // 
            // 查询qToolStripMenuItem
            // 
            this.查询qToolStripMenuItem.Image = ((System.Drawing.Image)(resources.GetObject("查询qToolStripMenuItem.Image")));
            this.查询qToolStripMenuItem.Name = "查询qToolStripMenuItem";
            this.查询qToolStripMenuItem.ShortcutKeys = ((System.Windows.Forms.Keys)((System.Windows.Forms.Keys.Control | System.Windows.Forms.Keys.Q)));
            this.查询qToolStripMenuItem.Size = new System.Drawing.Size(230, 30);
            this.查询qToolStripMenuItem.Text = "查询(&Q)";
            // 
            // 修改MToolStripMenuItem
            // 
            this.修改MToolStripMenuItem.Image = ((System.Drawing.Image)(resources.GetObject("修改MToolStripMenuItem.Image")));
            this.修改MToolStripMenuItem.Name = "修改MToolStripMenuItem";
            this.修改MToolStripMenuItem.ShortcutKeys = ((System.Windows.Forms.Keys)((System.Windows.Forms.Keys.Control | System.Windows.Forms.Keys.M)));
            this.修改MToolStripMenuItem.Size = new System.Drawing.Size(230, 30);
            this.修改MToolStripMenuItem.Text = "修改(&M)";
            // 
            // 录入UToolStripMenuItem
            // 
            this.录入UToolStripMenuItem.Image = ((System.Drawing.Image)(resources.GetObject("录入UToolStripMenuItem.Image")));
            this.录入UToolStripMenuItem.Name = "录入UToolStripMenuItem";
            this.录入UToolStripMenuItem.Size = new System.Drawing.Size(210, 30);
            this.录入UToolStripMenuItem.Text = "录入(&U)";
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(9F, 18F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(628, 414);
            this.Controls.Add(this.toolStrip1);
            this.Controls.Add(this.menuStrip1);
            this.MainMenuStrip = this.menuStrip1;
            this.Name = "Form1";
            this.Text = "学生成绩管理系统";
            this.menuStrip1.ResumeLayout(false);
            this.menuStrip1.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.MenuStrip menuStrip1;
        private System.Windows.Forms.ToolStripMenuItem 学生信息ToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem 查询qToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem 修改MToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem 学生成绩ToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem 录入UToolStripMenuItem;
        private System.Windows.Forms.ToolStrip toolStrip1;
    }
}

