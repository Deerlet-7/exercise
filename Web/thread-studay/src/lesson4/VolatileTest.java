package lesson4;

public class VolatileTest {
    private static final int NUM = 20;
    private static final int COUNT = 10000;
    private volatile static int SUM = 0;

    public static void main(String[] args) {
        for (int i = 0; i < NUM; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j <COUNT ; j++) {
                        //volatial不能保证原子性，所以不能满足n++，n--操作的线程安全
                        //volatile对变量进行赋值操作时，需要是常量（不能依赖变量）
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
