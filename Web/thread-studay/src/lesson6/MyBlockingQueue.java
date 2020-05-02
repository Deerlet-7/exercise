package lesson6;

/**
 * Created by Deerlet-7 on 2020/5/2 14:55
 * 阻塞式队列 满足线程安全的生产消费
 *          到上线不生产 到下线不消费
 */
public class MyBlockingQueue<E> {
    private Object[] items;
    private int takeIndex;//弹出元素索引
    private int putIndex = 0;//添加索引
    private int size;//有效容量
    public MyBlockingQueue(int capacity){
        items = new Object[capacity];
    }
    public synchronized void put(E e) throws InterruptedException {
        while (size == items.length){//达到上限，需要等待
            wait();
        }
        putIndex = (putIndex + 1)%items.length;//存放元素。索引++，需要满足循环队列索引》数组长度的情况
        items[putIndex] = e;//存放元素
        size++;
        notifyAll();
    }
    public synchronized E take() throws InterruptedException {
        while (size == 0){//达到下线 需要等待
            wait();
        }
        takeIndex = (takeIndex + 1) % items.length;
        size--;
        notifyAll();
        return (E)items[takeIndex];
    }
    public static void main(String[] args) throws InterruptedException {
        MyBlockingQueue<Integer> queue = new MyBlockingQueue<>(100);
        for (int i = 0; i < 5; i++) {
            final int k = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        for (int j = 0; j < 100; j++) {
                            queue.put(k*100 + j);
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
        while (true){
            int num = queue.take();
            System.out.println(num);
        }
    }
}
