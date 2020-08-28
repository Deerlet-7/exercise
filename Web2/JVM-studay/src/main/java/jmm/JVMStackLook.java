package jmm;

public class JVMStackLook {

    //se讲的，方法执行的时候，传入参数和内存关系，包括值传递，引用传递
    public static void test(int[] array, int index){
        System.out.println(index);
        if(index <= 2)
            return;
        test(array, index - 1);
    }

    public static void test2(Node node){
        node.next = new Node("B");
        node = new Node("C");
    }

    public static void main(String[] args) {
//        int[] array = {4, 5, 10, 1, 15};
//        test(array, 10);
        Node node = new Node("A");
        test2(node);
        System.out.println(node.name);
        System.out.println(node.next.name);
    }

    private static class Node{
        private Node next;
        private String name;

        public Node(String name) {
            this.name = name;
        }
    }
}
