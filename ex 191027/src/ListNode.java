class ListNode {
        public int data;
        public ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }//节点类

class MySignalList {
        public ListNode head;
        public MySignalList() {
            this.head = null;
        }
        //头插法
        public void addFirst(int data) {
            ListNode node = new ListNode(data);
        }
        //尾插法
        public void addLast(int data){
            ListNode cur = head;
        }
        //查找是否包含关键字kay
        public boolean contains(int key){
            return false;
        }

        public void addIdex(){
            ListNode cur = searchIndex(index);

        }

}//单链表

