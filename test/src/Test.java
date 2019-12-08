public class Test {
    public static void main(String[] args) {
        MySignalList mySignalList = new MySignalList();
        mySignalList.addLast(1);//
        mySignalList.addLast(3);
        mySignalList.addLast(5);
        mySignalList.addLast(7);
        mySignalList.addLast(9);
        mySignalList.display();
        MySignalList mySignalList2 = new MySignalList();
        mySignalList2.addLast(1);
        mySignalList2.addLast(2);
        mySignalList2.addLast(3);
        mySignalList2.addLast(4);
        mySignalList2.addLast(5);
        mySignalList2.display();
        MySignalList mySignalList3 = new MySignalList();
        mySignalList3.Merge(mySignalList,mySignalList2);

    }


}
