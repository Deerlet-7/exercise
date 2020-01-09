namespace Lab2
{
    partial class AdminDenglu1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            this.menuStrip1 = new System.Windows.Forms.MenuStrip();
            this.系统ToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.实验室ToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.账号管理ToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.退出ToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.返回ToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.查看实验室ToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.添加账号ToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.删除账号ToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.查看账号ToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.dataGridView1 = new System.Windows.Forms.DataGridView();
            this.Column1 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Column2 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Column3 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.statusStrip1 = new System.Windows.Forms.StatusStrip();
            this.toolStripStatusLabel1 = new System.Windows.Forms.ToolStripStatusLabel();
            this.timer1 = new System.Windows.Forms.Timer(this.components);
            this.menuStrip1.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).BeginInit();
            this.statusStrip1.SuspendLayout();
            this.SuspendLayout();
            // 
            // menuStrip1
            // 
            this.menuStrip1.ImageScalingSize = new System.Drawing.Size(24, 24);
            this.menuStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.系统ToolStripMenuItem,
            this.实验室ToolStripMenuItem,
            this.账号管理ToolStripMenuItem});
            this.menuStrip1.Location = new System.Drawing.Point(0, 0);
            this.menuStrip1.Name = "menuStrip1";
            this.menuStrip1.Size = new System.Drawing.Size(708, 32);
            this.menuStrip1.TabIndex = 0;
            this.menuStrip1.Text = "menuStrip1";
            // 
            // 系统ToolStripMenuItem
            // 
            this.系统ToolStripMenuItem.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.退出ToolStripMenuItem,
            this.返回ToolStripMenuItem});
            this.系统ToolStripMenuItem.Name = "系统ToolStripMenuItem";
            this.系统ToolStripMenuItem.Size = new System.Drawing.Size(58, 28);
            this.系统ToolStripMenuItem.Text = "系统";
            // 
            // 实验室ToolStripMenuItem
            // 
            this.实验室ToolStripMenuItem.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.查看实验室ToolStripMenuItem});
            this.实验室ToolStripMenuItem.Name = "实验室ToolStripMenuItem";
            this.实验室ToolStripMenuItem.Size = new System.Drawing.Size(76, 28);
            this.实验室ToolStripMenuItem.Text = "实验室";
            // 
            // 账号管理ToolStripMenuItem
            // 
            this.账号管理ToolStripMenuItem.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.添加账号ToolStripMenuItem,
            this.删除账号ToolStripMenuItem,
            this.查看账号ToolStripMenuItem});
            this.账号管理ToolStripMenuItem.Name = "账号管理ToolStripMenuItem";
            this.账号管理ToolStripMenuItem.Size = new System.Drawing.Size(94, 28);
            this.账号管理ToolStripMenuItem.Text = "账号管理";
            this.账号管理ToolStripMenuItem.Click += new System.EventHandler(this.账号管理ToolStripMenuItem_Click);
            // 
            // 退出ToolStripMenuItem
            // 
            this.退出ToolStripMenuItem.Name = "退出ToolStripMenuItem";
            this.退出ToolStripMenuItem.Size = new System.Drawing.Size(210, 30);
            this.退出ToolStripMenuItem.Text = "返回";
            this.退出ToolStripMenuItem.Click += new System.EventHandler(this.退出ToolStripMenuItem_Click);
            // 
            // 返回ToolStripMenuItem
            // 
            this.返回ToolStripMenuItem.Name = "返回ToolStripMenuItem";
            this.返回ToolStripMenuItem.Size = new System.Drawing.Size(210, 30);
            this.返回ToolStripMenuItem.Text = "切换用户";
            this.返回ToolStripMenuItem.Click += new System.EventHandler(this.返回ToolStripMenuItem_Click);
            // 
            // 查看实验室ToolStripMenuItem
            // 
            this.查看实验室ToolStripMenuItem.Name = "查看实验室ToolStripMenuItem";
            this.查看实验室ToolStripMenuItem.Size = new System.Drawing.Size(210, 30);
            this.查看实验室ToolStripMenuItem.Text = "查看实验室";
            this.查看实验室ToolStripMenuItem.Click += new System.EventHandler(this.查看实验室ToolStripMenuItem_Click);
            // 
            // 添加账号ToolStripMenuItem
            // 
            this.添加账号ToolStripMenuItem.Name = "添加账号ToolStripMenuItem";
            this.添加账号ToolStripMenuItem.Size = new System.Drawing.Size(210, 30);
            this.添加账号ToolStripMenuItem.Text = "添加账号";
            this.添加账号ToolStripMenuItem.Click += new System.EventHandler(this.添加账号ToolStripMenuItem_Click);
            // 
            // 删除账号ToolStripMenuItem
            // 
            this.删除账号ToolStripMenuItem.Name = "删除账号ToolStripMenuItem";
            this.删除账号ToolStripMenuItem.Size = new System.Drawing.Size(210, 30);
            this.删除账号ToolStripMenuItem.Text = "删除账号";
            this.删除账号ToolStripMenuItem.Click += new System.EventHandler(this.删除账号ToolStripMenuItem_Click);
            // 
            // 查看账号ToolStripMenuItem
            // 
            this.查看账号ToolStripMenuItem.Name = "查看账号ToolStripMenuItem";
            this.查看账号ToolStripMenuItem.Size = new System.Drawing.Size(210, 30);
            this.查看账号ToolStripMenuItem.Text = "查看账号";
            this.查看账号ToolStripMenuItem.Click += new System.EventHandler(this.查看账号ToolStripMenuItem_Click);
            // 
            // dataGridView1
            // 
            this.dataGridView1.AllowUserToAddRows = false;
            this.dataGridView1.AllowUserToDeleteRows = false;
            this.dataGridView1.AllowUserToOrderColumns = true;
            this.dataGridView1.AllowUserToResizeColumns = false;
            this.dataGridView1.AllowUserToResizeRows = false;
            this.dataGridView1.AutoSizeColumnsMode = System.Windows.Forms.DataGridViewAutoSizeColumnsMode.Fill;
            this.dataGridView1.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridView1.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.Column1,
            this.Column2,
            this.Column3});
            this.dataGridView1.Location = new System.Drawing.Point(13, 36);
            this.dataGridView1.Name = "dataGridView1";
            this.dataGridView1.RowTemplate.Height = 30;
            this.dataGridView1.Size = new System.Drawing.Size(683, 427);
            this.dataGridView1.TabIndex = 1;
            // 
            // Column1
            // 
            this.Column1.HeaderText = "用户名";
            this.Column1.Name = "Column1";
            // 
            // Column2
            // 
            this.Column2.HeaderText = "密码";
            this.Column2.Name = "Column2";
            // 
            // Column3
            // 
            this.Column3.HeaderText = "身份";
            this.Column3.Name = "Column3";
            // 
            // statusStrip1
            // 
            this.statusStrip1.ImageScalingSize = new System.Drawing.Size(24, 24);
            this.statusStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.toolStripStatusLabel1});
            this.statusStrip1.Location = new System.Drawing.Point(0, 453);
            this.statusStrip1.Name = "statusStrip1";
            this.statusStrip1.Size = new System.Drawing.Size(708, 22);
            this.statusStrip1.TabIndex = 2;
            this.statusStrip1.Text = "statusStrip1";
            // 
            // toolStripStatusLabel1
            // 
            this.toolStripStatusLabel1.Name = "toolStripStatusLabel1";
            this.toolStripStatusLabel1.Size = new System.Drawing.Size(49, 24);
            this.toolStripStatusLabel1.Text = "time";
            this.toolStripStatusLabel1.Visible = false;
            // 
            // timer1
            // 
            this.timer1.Tick += new System.EventHandler(this.timer1_Tick);
            // 
            // AdminDenglu1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(9F, 18F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(708, 475);
            this.Controls.Add(this.statusStrip1);
            this.Controls.Add(this.dataGridView1);
            this.Controls.Add(this.menuStrip1);
            this.MainMenuStrip = this.menuStrip1;
            this.Name = "AdminDenglu1";
            this.Text = "AdminDenglu1";
            this.Load += new System.EventHandler(this.AdminDenglu1_Load);
            this.menuStrip1.ResumeLayout(false);
            this.menuStrip1.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).EndInit();
            this.statusStrip1.ResumeLayout(false);
            this.statusStrip1.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.MenuStrip menuStrip1;
        private System.Windows.Forms.ToolStripMenuItem 系统ToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem 退出ToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem 返回ToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem 实验室ToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem 查看实验室ToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem 账号管理ToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem 添加账号ToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem 删除账号ToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem 查看账号ToolStripMenuItem;
        private System.Windows.Forms.DataGridView dataGridView1;
        private System.Windows.Forms.DataGridViewTextBoxColumn Column1;
        private System.Windows.Forms.DataGridViewTextBoxColumn Column2;
        private System.Windows.Forms.DataGridViewTextBoxColumn Column3;
        private System.Windows.Forms.StatusStrip statusStrip1;
        private System.Windows.Forms.ToolStripStatusLabel toolStripStatusLabel1;
        private System.Windows.Forms.Timer timer1;
    }
}