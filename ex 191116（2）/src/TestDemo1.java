public class TestDemo1 {
    public static void main(String[] args) {
        SignalList signalList = new SignalList();
        signalList.addLast(1);
        signalList.addLast(2);
        signalList.addLast(3);
        signalList.addLast(4);
        signalList.addLast(5);
        signalList.display();
        System.out.println("=============================");
        System.out.println(signalList.contains(9));
;    }
}
