//顺序表的测试类
public class TestDemo1 {
    public static void main(String[] args) {
        MySingnalList mySingnalList = new MySingnalList();
        mySingnalList.addLast(1);
        mySingnalList.addLast(2);
        mySingnalList.addLast(3);
        mySingnalList.addLast(4);
        mySingnalList.addLast(5);
        mySingnalList.display();
//        System.out.println(mySingnalList.contains(0));
//        System.out.println(mySingnalList.size());
        mySingnalList.addIndex(4,8);
        mySingnalList.display();
    }



    public static void main1(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(0,1);
        myArrayList.add(0,2);
        myArrayList.add(0,3);
        myArrayList.add(0,4);
        myArrayList.add(0,5);
        myArrayList.display();
//        System.out.println(myArrayList.contains(4));
//        System.out.println(myArrayList.search(5));
//        System.out.println(myArrayList.getPos(2));
        myArrayList.remove(3);
        myArrayList.display();
//        myArrayList.remove(2);
//        myArrayList.display();
    }
}
