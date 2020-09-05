import java.util.ArrayList;

/**
 * Created by Deerlet-7 on 2020/9/3 10:35
 */
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Main1 {
    ArrayList<Integer> arraylist = new ArrayList<Integer>();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if(listNode != null){
            this.printListFromTailToHead(listNode.next);
            arraylist.add(listNode.val);
        }
        return arraylist;
    }
}
