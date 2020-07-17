package lesson2;

public class ThreadJion {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
//                try {
//                    Thread.sleep(1);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                System.out.println(Thread.currentThread().getName());
            }
        });
        t.start();
        //先将t线程执行完毕再往下执行
        //t线程：线程引用对象
        //当前线程运行态---》阻塞态 等待（满足一定条件），t线程（不做任何事情）
        //一定条件：1）有传入时间 2）t线程引用对象执行完毕
        t.join(5000);
        System.out.println(Thread.currentThread().getName());
    }
}
