package lesson5;

/**
 * Created by Deerlet-7 on 2020/5/1 16:21
 */
public class BreadOperator {
    //库存面包数量：100-0
    public static volatile int SUM;
    public static void main(String[] args) {
        //启动生产者线程生产面包
        for (int i = 0; i < 5; i++) {
            new Thread(new Productor(),"面包师傅"+i).start();
        }
        //启动消费者线程消费面包
        for (int i = 0; i < 20; i++) {
            new Thread(new Consumer(),"消费者"+i).start();
        }
    }
    //默认生产者：面包师傅生产面包，一次3个,每个面包师傅生产20次
    private static class Productor implements Runnable{
        @Override
        public void run() {
            try {
                for (int i = 0; i < 20; i++) {
                    synchronized (BreadOperator.class){
                        while (SUM + 3 > 100){//库存在97以上就不生产
                            //释放对象锁，让其他线程进入同步代码块，当前线程进入阻塞状态
                            BreadOperator.class.wait();
                        }
                        SUM += 3;//生产面包
                        Thread.sleep(50);
                        BreadOperator.class.notifyAll();
                        System.out.println(Thread.currentThread().getName()+",生产了，库存为："+SUM);
                    }
                    Thread.sleep(10);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    //默认消费者：消费面包，一次消费一个面包，消费者一直消费
    private static class Consumer implements Runnable{
        @Override
        public void run() {
            try {
                while (true){
                    synchronized (BreadOperator.class){
                        //库存为0，不能继续消费，阻塞当前线程
                        while (SUM == 0){
                            BreadOperator.class.wait();
                        }
                        SUM--;
                        Thread.sleep(50);
                        //在synchronized代码块结束之后才会唤醒
                        BreadOperator.class.notifyAll();
                        System.out.println(Thread.currentThread().getName()+",消费了，库存为："+SUM);
                    }
                    Thread.sleep(10);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
