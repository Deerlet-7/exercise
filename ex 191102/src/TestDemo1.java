import javax.xml.soap.Node;

//顺序表的测试类
public class TestDemo1 {
    //创建相交
    public static void createCut(ListNode headA,ListNode headB) {
        headA.next = headB.next.next;
    }
    //相交链表 返回相交节点
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
    }
    //合并两个有序链表
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
    public static void main(String[] args) {
        MySingnalList mySingnalList = new MySingnalList();
        mySingnalList.addLast(1);
        mySingnalList.addLast(2);
        mySingnalList.addLast(3);
        mySingnalList.addLast(2);
        mySingnalList.addLast(99);
        mySingnalList.display();
        MySingnalList mySingnalList2 = new MySingnalList();
        mySingnalList2.addLast(1);
        mySingnalList2.addLast(2);
        mySingnalList2.addLast(3);
        mySingnalList2.addLast(2);
        mySingnalList2.addLast(99);
        ListNode ret = getIntersectionNode(mySingnalList.head,mySingnalList2.head);
        System.out.println(ret.data);
    }
}