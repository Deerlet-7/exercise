package day20;

/**
 * Created by Deerlet-7 on 2020/4/22 22:48
 */
 class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Partition {
    public ListNode partition(ListNode pHead, int x) {
        // write code here
        if(null == pHead || null == pHead.next){
            return pHead;
        }
        ListNode smallHead = new ListNode(-1);
        ListNode bigHead = new ListNode(-1);
        ListNode sList = smallHead;
        ListNode bList = bigHead;
        ListNode cur = pHead;
        while (cur != null){
            if(cur.val<x){
                sList.next = cur;
                sList = sList.next;
            }else {
                bList.next = cur;
                bList = bList.next;
            }
            cur = cur.next;
        }
        sList.next = bigHead.next;
        bList.next = null;
        return  smallHead.next;
    }
}

