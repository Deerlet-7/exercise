package lesson4;

public class SafeThread {
    private static final int NUM = 20;
    private static int COUNT = 10000;
    private static int SUM ;
    public static void main(String[] args) {
        for (int i = 0; i < NUM; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j <COUNT ; j++) {
                        increment();
                    }
                }
            }).start();
        }
        while (Thread.activeCount()>1){
            Thread.yield();
        }
        System.out.println(SUM);
    }
    public static synchronized void increment(){
        SUM++;
    }

}
