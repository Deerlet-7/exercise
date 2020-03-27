package lesson3;

public class UnsafeThread {
    private static final int NUM = 20;
    private static final int COUNT = 10000;
    private static int SUM = 0;

    public static void main(String[] args) {
        //同时启动20个线程，每个线程对同一个变量执行操作：循环10000次每次++
        for (int i = 0; i < NUM; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j <COUNT ; j++) {
                        SUM++;
                    }
                }
            }).start();
        }
        while (Thread.activeCount()>1){
            Thread.yield();
        }
        System.out.println(SUM);
    }
}
