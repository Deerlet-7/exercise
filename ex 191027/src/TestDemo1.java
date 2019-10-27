class MyArrayList {
    public int usedSize;
    public int[] elem;

    public final int CAPACITY = 10;

    public MyArrayList() {
        this.usedSize = 0;
        this.elem = new int[CAPACITY];
    }

    // 在 pos 位置新增元素
    public void add(int pos, int data) {
        //1、pos是否合法
        //2、挪数据
        //3、插入数据
        //4、usedSize++
        int a = usedSize;
        int pos1 = usedSize;
        if(pos>0 && pos<usedSize){
            while (pos1 >= pos){
                int i = 1;
                elem[a] = elem[a - i];
                pos1 = a - i;
                i++;
            }
            elem[pos] = data;
            usedSize++;
        }else {

        }
    }
    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        for (int i = 0; i <usedSize ; i++) {
            if(toFind == this.elem[i]){
                return true;
            }
        }
        return false;
    }
    // 查找某个元素对应的位置
    public int search(int toFind) {
        for (int i = 0; i <usedSize ; i++) {
            if(toFind == this.elem[i]){
                return i;
            }
        }
            return -1;
    }
    // 获取 pos 位置的元素
    public int getPos(int pos) {
        if(pos>0&&pos<usedSize){
            int a = this.elem[pos];
            return a;
        }
        return -1;
    }
    // 给 pos 位置的元素设为 value
    // public void setPos(int pos, int value) { }
    //删除第一次出现的关键字key
    public void remove(int toRemove) {
        if (usedSize != 0){
            for (int i = 0; i < usedSize; i++) {

            }
        }
    }
    // 获取顺序表长度
    public int size() { return 0; }
    // 清空顺序表
    public void clear() { }
    // 打印顺序表
    public void display() { }
}
