class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
class MySignalList {
    public ListNode head;

    public MySignalList() {
        this.head = null;//
    }
    public void addLast(int data){
        ListNode node = new ListNode(data);
        ListNode cur =this.head ;
        if(this.head == null) {
            this.head = node;
        }else {
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }
    }
    public MySignalList Merge(MySignalList list1,MySignalList list2) {
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        ListNode cur = list1.head;
        ListNode cur2 = list2.head;
        MySignalList list = null;
        if(cur.val<cur2.val){
            list = cur;
            cur = cur.next;
        }else{
            list = cur2;
            cur2 = cur2.next;
        }
        while(cur!=null||cur2!=null){
            if(cur.val<cur2.val){
                list.next = cur;
                cur = cur.next;
            }else{
                list.next = cur2;
                cur2 = cur2.next;
            }
        }
        if(cur == null){
            while(cur2!=null){
                list.next = cur2;
                cur2=cur2.next;
            }

        }else{
            while(cur !=null){
                list.next = cur;
                cur = cur.next;
            }

        }
        return list;
    }
    public void display() {
        ListNode cur = this.head;
        while (cur != null) {
            System.out.print(cur.val+" ");
            cur = cur.next;
        }
        System.out.println();
    }
}
