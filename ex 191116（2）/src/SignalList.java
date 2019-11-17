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
    public void
    //打印
    public void display(){
        ListNode cur = this.head;
        while (cur!=null){
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
    }
}
