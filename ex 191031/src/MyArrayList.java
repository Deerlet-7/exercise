import java.util.Arrays;

class MyArrayList {
    public int usedSize;
    public int[] elem;
    public final int CAPACITY = 10;//把容量设置成一个常量
    public MyArrayList(){
        this.usedSize = 0;
        this.elem = new int[CAPACITY];//对elem进行初始化,new的数组存放在对象外的堆里，对象里的elem是一个对new的数组的引用
    }
    private boolean isFull(){
//        if(this.usedSize == this.elem.length){
//            return true;
//        }
//        return false;
        return this.usedSize == this.elem.length;
    }
    private boolean isEmpty(){
//        if(this.usedSize == 0){
//            return true;
//        }
//        return false;
        return this.usedSize == 0;
    }
     // 在 pos 位置新增元素
     public void add(int pos, int data) {
        if(isFull()){
            this.elem = Arrays.copyOf(this.elem,this.elem.length*2);//扩容并且把内容搬家
        }
         //1、pos是否合法
         if(pos<0 || pos > this.usedSize){
             System.out.println("pos不合法");
             return;
             //throw new IndexOutOfBoundsException("pos位置不合法");  写一个即可
         }
         //2、挪数据
         for (int i = this.usedSize-1; i >= pos ; i--) {
             this.elem[i+1] = this.elem[i];
         }
         //3、插入数据
         this.elem[pos] = data;
         //4、usedSize++
         this.usedSize++;
     }
     // 判定是否包含某个元素
     public boolean contains(int toFind) {
         for (int i = 0; i <usedSize ; i++) {
             if(this.elem[i] == toFind){
                 return true;
             }
         }
         return false;
     }
     // 查找某个元素对应的位置
     public int search(int toFind) {
         if(isEmpty()){
             System.out.println("顺序表为空");
             return -1;
         }
         for (int i = 0; i < this.usedSize ; i++) {
             if(this.elem[i] == toFind){
                 return i;
             }
         }
         return -1;
     }
     // 获取 pos 位置的元素
     public int getPos(int pos) {
         if(pos<0 || pos > this.usedSize){
             System.out.println("pos不合法");
             return -1;
             //throw new IndexOutOfBoundsException("pos位置不合法");  写一个即可
         }
         return this.elem[pos];
     }
     //删除第一次出现的关键字key
     public void remove(int toRemove) {
         //1、判断顺序表是否为空(在search中判断)
         //2、查找toRemove下标
         int index = search(toRemove);
         if(index == -1){
             System.out.println("没有这个key");
             return;
         }
         //3、删除i
         for (int i = index; i < this.usedSize-1; i++) {
             this.elem[i]=this.elem[i+1];
         }
         this.usedSize--;
     }
     // 获取顺序表长度
     public int size() {
        return this.usedSize;
     }
     // 清空顺序表
     public void clear() {
        this.usedSize = 0;
     }
     // 打印顺序表
     public void display() {
         for (int i = 0; i <usedSize ; i++) {
             System.out.print(this.elem[i]+" ");
         }
         System.out.println();
     }
}
