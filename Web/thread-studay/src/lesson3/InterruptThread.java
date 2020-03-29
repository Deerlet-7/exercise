package lesson3;

public class InterruptThread {
    //中断线程单线程并没有处理中断请求
    public static void test1(){
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){

                }
            }
        });
        t.start();
        t.interrupt();
    }
    public static void test2(){
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!Thread.currentThread().isInterrupted()){
                    System.out.println(Thread.currentThread().getName());
                }
            }
        });
        t.start();//t线程中断标志位=false
        t.interrupt();//t线程中断标志位=true
    }
    public static void test3(){
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println(Thread.currentThread().isInterrupted());
                    Thread.sleep(3000);
//                    System.out.println(Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    System.out.println(Thread.currentThread().isInterrupted());
                }
            }
        });
        t.start();//t线程中断标志位=false
        t.interrupt();//t线程中断标志位=true
    }
    public static void test4(){
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.interrupted());
                }
            }
        });
        t.start();
        t.interrupt();
    }
    private static volatile boolean IS_INTERRUPTED;
    //自定义标志位
    public static void test5(){
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
               /* while (!IS_INTERRUPTED){
                    System.out.println(Thread.currentThread().getName());
                }*/
                try {
                    Thread.sleep(99999);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t.start();
        IS_INTERRUPTED = true;
    }
    public static void main(String[] args) {
        test3();
    }
}
