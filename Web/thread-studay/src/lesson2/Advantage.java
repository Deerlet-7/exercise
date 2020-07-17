package lesson2;

public class Advantage {
    private static final int NUM = 2;
    private static void increment(){
        int count = 10_0000_0000;
        for (int i = 0; i <count ; i++) {
            count--;
        }
    }
    //串行（代码行依次执行）
    private static void serial(){
        long start = System.nanoTime();//1970-01-01开始到现在
        for (int i = 0; i < NUM ; i++) {
            increment();
        }
        long end = System.nanoTime();
        System.out.printf("串行时间：%s毫秒\n",(end-start)/1000/1000);
    }
    //并发（有时候Java语义即表示并发也表示并行）
    private static void parallel(){
        long start = System.nanoTime();//1970-01-01开始到现在
        for (int i = 0; i <NUM ; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    increment();
                }
            }).start();
        }
        while (Thread.activeCount()>1){//活跃线程数大于一，让当前线程让步
            Thread.yield();
        }
        long end = System.nanoTime();
        System.out.printf("并发时间：%s毫秒",(end-start)/1000/1000);
    }
    public static void main(String[] args) {
        serial();
        parallel();
    }
}
