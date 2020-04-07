package day05;

/**
 * Created by Deerlet-7 on 2020/4/7 15:15
 */
public class Test2 {
    public static void main(String args[])throws InterruptedException{
        Thread t=new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.print("2");
            }
        });
        t.start();
        t.join(1000);
        System.out.print("1");
    }

}
