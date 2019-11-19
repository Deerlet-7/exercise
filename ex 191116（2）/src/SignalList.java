class ListNode{
    public int data;
    public ListNode next;
    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}
public class SignalList {
    public ListNode head;
    public SignalList() {
    }
    //头插
    public void addFirst(int data){
        ListNode node = new ListNode(data);
        if(this.head == null){
            this.head = node;
        }else {
            node.next = this.head;
            this.head = node;
        }
    }
    //尾插
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
    //寻找index个节点
    private ListNode searchIndex(int index){
        ListNode cur = this.head;
        while (index != 0){
            cur = cur.next;
            index--;
        }
        return cur;
    }
    //得到链表长度
    private int size(){
        ListNode cur = this.head;
        int count = 0;
        while (cur != null){
            count++;
            cur = cur.next;
        }
        return count;
    }
//    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data){
        ListNode node = new ListNode(data);
        if(index<0||index>size()){
            System.out.println("index不合法");
            return ;
        }
        if (index == 0){
            addFirst(data);
            return;
        }else if(index == size()){
            addLast(data);
            return;
        }else {
            ListNode cur = searchIndex(index-1);//二如果cur和node一样定义在一开始，当index=0时，报空指针异常
            node.next = cur.next;
            cur.next = node;
        }
    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        ListNode cur = this.head;
        while (cur != null){
            if(cur.data == key){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    //找要删除key的前驱
    private ListNode searchPrev(int key) {
        ListNode prev = this.head;
        while (prev.next!=null){
            if(prev.next.data == key){
                return prev;
            }
            prev = prev.next;
        }
        return null;
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key){
        if(this.head == null){
            System.out.println("单链表为空");
            return;
        }
        if(this.head.data == key){
            this.head = this.head.next;
            return;
        }
        ListNode prev = searchPrev(key);
        if(prev == null){
            System.out.println("没有该节点");
            return;
        }
        ListNode del = prev.next;
        prev.next = del.next;
    }
    //单链表的中间节点
    public ListNode middleNode() {
        ListNode fast = this.head;
        ListNode slow = this.head;
        while (fast != null&&fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    //
    //反转单链表
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = this.head;
        ListNode newHead = null;
        while (cur != null){
            ListNode curNext = cur.next;
            if(curNext == null){
                newHead = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        return newHead;
    }
    public void display2(ListNode newHead) {
        ListNode cur = newHead;
        while (cur != null) {
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }
    //打印
    public void display(){
        ListNode cur = this.head;
        while (cur!=null){
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }
}
