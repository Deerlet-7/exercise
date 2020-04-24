package day22;

/**
 * Created by Deerlet-7 on 2020/4/24 20:21
 * 链式A+B
 */
import java.util.*;
 class ListNode {
    int val;
    ListNode next = null;
    ListNode(int val) {
        this.val = val;
    }
}
public class Plus {

    public ListNode plusAB(ListNode a, ListNode b) {
        if(a == null){
            return b;
        }else if (b == null){
            return a;
        }
        ListNode curA = a;
        ListNode curB = b;
        ListNode head = new ListNode(0);
        ListNode p = head;
        int sum = 0;
        while (curA != null || curB != null || sum != 0) {
            if (curA != null) {
                sum += curA.val;
                curA = curA.next;
            }
            if (curB != null) {
                sum += curB.val;
                curB = curB.next;
            }
            p.next = new ListNode(sum % 10);
            sum /= 10;
            p = p.next;
        }
        return head.next;
    }
}
