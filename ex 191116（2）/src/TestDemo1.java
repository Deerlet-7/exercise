public class TestDemo1 {
    public static void main(String[] args) {
        SignalList signalList = new SignalList();
        signalList.addLast(2);
        signalList.addLast(2);
        signalList.addLast(2);
        signalList.addLast(3);
        signalList.addLast(2);
        signalList.display();
        System.out.println("=============================");
        signalList.removeAllKey(2);
        signalList.display();
;    }
}
