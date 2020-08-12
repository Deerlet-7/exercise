//顺序表的测试类
public class TestDemo1 {
    public static ListNode  getIntersectionNode
            (ListNode headA,ListNode headB){
        if(headA == null || headB == null) {
            return null;
        }
        //永远指向最长的单链表
        ListNode pL = headA;
        //永远指向最短的单链表
        ListNode pS = headB;
        int lenA = 0;
        int lenB = 0;
        //分别求长度
        while (pL != null) {
            lenA++;
            pL = pL.next;
        }
        while (pS != null) {
            lenB++;
            pS = pS.next;
        }
        pL = headA;
        pS = headB;
        //求长度的差值
        int len = lenA-lenB;
        //如果是负数-》pL = headB;  pS = headA
        if(len < 0) {
            pL = headB;
            pS = headA;
            len = lenB-lenA;
        }
        //只需要让pL走len步就好了
        while (len > 0) {
            pL = pL.next;
            len--;
        }
        //走完len步之后  两个同时开始走
        //一直走 走到next值相同时 就是交点
        while (pL != pS && pL != null) {
            pL = pL.next;
            pS = pS.next;
        }

        if(pL == pS && pS != null) {
            return pL;
        }
        return null;

        /*while (pL.next != pS.next) {
            pL = pL.next;
            pS = pS.next;
        }*/
        //万一没有相交 并且两个单链表长度一样
        // 防止最后一个节点
      /*  if(pL.next == pS.next && pL.next!=null) {
            return pL.next;
        }
        return null;*/
    }

    public static void main(String[] args) {
        MySingnalList mySingnalList = new MySingnalList();
        mySingnalList.addLast(1);
        mySingnalList.addLast(2);
        mySingnalList.addLast(3);
        mySingnalList.addLast(2);
        mySingnalList.addLast(1);
        mySingnalList.display();
    }
}