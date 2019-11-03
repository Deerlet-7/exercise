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
    //以x为基准分割链表
    public ListNode partion(int x) { //未判断最后为空的情况
        ListNode cur = this.head;
        ListNode beforeStart = null;
        ListNode beforeEnd = null;
        ListNode afterStart = null;
        ListNode afterEnd = null;
        while (cur != null) {
            //cur.data < x
            if (cur.data < x) {
                //第一次插入
                if (beforeStart == null) {
                    beforeStart = cur;
                    beforeEnd = beforeStart;
                } else {
                    beforeEnd.next = cur;
                    beforeEnd = beforeEnd.next;
                }
            } else {
                //第一次插入
                if (afterStart == null) {
                    afterStart = cur;
                    afterEnd = afterStart;
                } else {
                    afterEnd.next = cur;
                    afterEnd = afterEnd.next;
                }
            }
            cur = cur.next;
        }
        if (beforeStart == null) {
            return afterStart;
        }
        beforeEnd.next = afterStart;
        return beforeEnd;
    }
    //删除重复的节点
    public ListNode deleteDuplication() {
        ListNode node = new ListNode(-16);
        ListNode cur = this.head;
        ListNode tmp = node;
        int count = 0;
        while (cur != null) {
            if(cur.next != null &&
                    cur.data == cur.next.data) {
                //1、循环
                //2、退出循环 cur要多走一步
                while (cur.next != null && cur.data == cur.next.data){
                    cur = cur.next;
                }
                cur = cur.next;
            }else {
                //当前节点 不等于下一个节点的时候
                tmp.next = cur;
                cur = cur.next;
                tmp = tmp.next;
            }
        }
        return node.next;
    }
    //回文
    public boolean chkPalindrome() {
        ListNode fast = this.head;
        ListNode slow = this.head;

        while (fast != null && fast.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        //反转
        ListNode p = slow.next;
        while (p != null) {
            ListNode pNext = p.next;
            //反转
            p.next = slow;
            slow = p;
            p = pNext;
        }
        //slow往前    head 往后  .data不一样 返回false
        while (this.head != slow ){
            if(head.data != slow.data){
                return false;
            }
            if(this.head.data == slow.data){
                return true;
            }
                this.head = this.head.next;
                slow = slow.next;
        }
        return true;
        //直到相遇
    }
    //判断是否有环
    public boolean hasCycle(){
        ListNode fast = this.head;
        ListNode slow = this.head;
        while (fast.next!=null||fast!=null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                break;
            }
        }
        if(fast.next==null||fast==null){
            return false;
        }
        return true;
    }
    //判断环的入口
    public ListNode detectCycle(){
        ListNode fast = this.head;
        ListNode slow = this.head;
        while (fast.next!=null||fast!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                break;
            }
        }
        if(fast==null||fast.next==null){
            return null;
        }
        fast = this.head;
        while (fast != slow){
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }
    public static void createCut(ListNode headA,ListNode headB) {
        headA.next.next = headB.next.next.next;
    }
    public ListNode mergeTwoLists(ListNode headA, ListNode headB) {
        ListNode node = new ListNode(-1);
        ListNode tmp = node;

        while (headA != null && headB != null) {
            if(headA.data < headB.data) {
                tmp.next = headA;
                headA = headA.next;
                tmp = tmp.next;
            }else {
                tmp.next = headB;
                headB = headB.next;
                tmp = tmp.next;
            }
        }
        if(headA != null) {
            tmp.next = headA;
        }
        if(headB != null) {
            tmp.next = headB;
        }
        return node.next;
    }
    //反转
    public ListNode reverseList(ListNode head) {
        ListNode cur = this.head;
        ListNode curNext = cur.next;
        ListNode tmp = this.head;
        while (tmp != null){
            tmp = tmp.next;

        }
        return tmp;
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
