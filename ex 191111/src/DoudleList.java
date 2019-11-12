class ListNode{
    public int data;
    public ListNode prev;
    public ListNode next;
    public ListNode(int data){
        this.data = data;
    }
}
public class DoudleList {
    public ListNode head;
    public ListNode last;
    public void addFirst(int data){
        ListNode node = new ListNode(data);
        if(this.head == null){
            this.head = node;
            this.last = node;
        }else {
           node.next = this.head;
           this.head.prev = node;
           this.head = node;
        }
    }
    public void addLast(int data){
        ListNode node = new ListNode(data);
        if(this.head == null){
            this.head = node;
            this.last = node;
        }else{
            node.prev = this.last;
            this.last.next = node;
            this.last = node;
        }
    }
    //求链表长度
    public int getLength(){
        ListNode cur = this.head;
        int count = 0;
        while (cur != null){
            cur = cur.next;
            count++;
        }
        return count;
    }
    //找指定位置节点
    private ListNode searchIndex(int index){
        if(index < 0 || index > getLength() || this.head == null){
            return null;
        }
        ListNode cur = this.head;
        while (index>0){
            cur = cur.next;
            index--;
        }
        return cur;
    }
    //指定位置插入节点
    public void addIndex(int index,int data){
        if(index == 0){
            addFirst(data);
            return;
        }
        if(index == getLength()){
            addLast(data);
            return;
        }
        ListNode cur = searchIndex(index);
        if(cur == null){
            return;
        }
        ListNode node = new ListNode(data);
        node.next = cur;
        node.prev = cur.prev;
        cur.prev.next = node;
        cur.prev = node;
    }
    //查找关键字key是否在链表中
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
    //删除第一次出现值为key的接节点,返回删除的节点的值
    public int remove(int key){
        ListNode cur = this.head;
        int oldData = -1;//存储要删除的数字
        while (cur != null){
            if(cur.data == key){
                oldData = cur.data;
                if(cur == this.head){
                    this.head = cur.next;
                    this.head.prev = null;
                }else if(cur == this.last){
                    this.last = cur.prev;
                    this.last.next = null;
                }else {
                    cur.prev.next = cur.next;
                    cur.next.prev = cur.prev;
                }
                return oldData;
            }
            cur = cur.next;
        }
        return oldData;
    }
    //删除所有出现值为key的节点
    public void removeAllKey(int key){
        ListNode cur = this.head;
        while (cur != null) {
            if(cur.data == key) {
                //头
                if(cur == this.head) {
                    this.head = this.head.next;
                    if(this.head == null){
                        return;
                    }
                    this.head.prev = null;
                }else {
                    cur.prev.next = cur.next;
                    //cur.next.prev = cur.prev;
                    if(cur.next != null) {
                        cur.next.prev = cur.prev;
                    }else {
                        //尾
                        this.last = cur.prev;
                    }
                }
            }
            cur = cur.next;
        }
//        ListNode cur = this.head;
//        int oldData = -1;//存储要删除的数字
//        while (cur != null){
//            if(cur.data == key){
//                oldData = cur.data;
//                if(cur == this.head){
//                    this.head = cur.next;
//                    this.head.prev = null;
//                }else if(cur == this.last){
//                    this.last = cur.prev;
//                    this.last.next = null;
//                }else {
//                    cur.prev.next = cur.next;
//                    cur.next.prev = cur.prev;
//                }
//            }
//            cur = cur.next;
//        }
//        return oldData;
    }
    //防止内存泄漏。

    public void clear(){
        while (this.head != null){
            ListNode cur = this.head.next;
            this.head.next = null;
            this.head.prev = null;
            this.head = cur;
        }
        this.last = null;//否则还会有最后一个节点被last引用
    }

    public void display(){
        ListNode cur = this.head;
        while (cur != null){
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }
}
