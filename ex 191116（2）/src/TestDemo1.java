public class TestDemo1 {
    public static void main(String[] args) {
        SignalList signalList = new SignalList();
        signalList.addLast(1);
        signalList.addLast(2);
        signalList.addLast(3);
        signalList.addLast(4);
        signalList.addLast(9);
        signalList.display();
        System.out.println("=============================");
        ListNode a = signalList.middleNode();
        System.out.println(a.data);

;    }
}
