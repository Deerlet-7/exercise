package lab;

public class LabList {
    private Lab[] labs = new Lab[10];
    private int size;//有效数据个数
    public LabList(){
        labs[0]=new Lab(101);
        labs[1]=new Lab(102);
        labs[2]=new Lab(103);
        this.size = 3;
    }

    public Lab getLab(int pos) {
        return labs[pos];
    }

    public void setLab(int pos,Lab lab) {
        this.labs[pos] = lab;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
