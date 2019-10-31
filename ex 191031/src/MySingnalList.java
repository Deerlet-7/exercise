class ListNode{
    public int data;
    public ListNode next;
    public ListNode(int data){
        this.data = data;
        this.next = null;
    }
}//节点类
public class MySingnalList {
    public ListNode head;
    public MySingnalList(){

    }
        //头插法
        public void addFirst(int data){
            ListNode node = new ListNode(data);
            if(this.head == null){
                this.head = node;
            }else {
                node.next = this.head;
                this.head = node;
            }
        }
        //尾插法
        public void addLast(int data){
            ListNode node = new ListNode(data);
            ListNode cur = this.head;
            if(this.head == null){
                this.head = node;
            }else {
                while (cur.next != null){
                    cur = cur.next;
                }
                cur.next = node;
            }
        }
        //找index-1的位置
        private ListNode searchIdex(int index){
            ListNode cur = this.head;
            int count = 0;
            while (count < index-1){
                count++;
                cur = cur.next;
            }
            return cur;
        }
        //任意位置插入,第一个数据节点为0号下标
        public boolean addIndex(int index,int data){
            if(index < 0||index>size()){
                System.out.println("index不合法");
                return false;
            }
            if(index == 0){
                addFirst(data);
                return true;
            }
            ListNode cur = searchIdex(index);
            ListNode node = new ListNode(data);
            node.next = cur.next;
            cur.next = node;
            return true;
        }
        //查找是否包含关键字key是否在单链表当中
        public boolean contains(int key){
            ListNode cur = this.head;
            while (cur != null ){
                if(cur.data == key){
                    return true;
                }
                cur = cur.next;
            }
            return false;
        }
        //删除第一次出现关键字为key的节点
        public void remove(int key){

        }
        //删除所有值为key的节点
        public void removeAllKey(int key){

        }
        //得到单链表的长度
        public int size(){
            ListNode cur = this.head;
            int count = 0;
            while (cur != null){
                count++;
                cur = cur.next;
            }
            return count;
        }
        public void display(){
            ListNode cur = this.head;
            while (cur != null){
                System.out.print(cur.data+" ");
                cur = cur.next;
            }
            System.out.println();
        }
        public void clear(){

        }

}//单链表
