package lesson2;

public class Main{
    public static void main(String[] args) {
        //创建线程方式1
        MyThread myThread = new MyThread();
        myThread.start();
//        myThread.run();
        //创建线程方式2
//        new MyThread().start();

        //创建线程方式3
//        new Thread(new MyRunnable()).start();//线程通过start方法启动
    }
}
class MyThread extends Thread {
    @Override
    public void run() {//run是线程运行时候的代码块
        //代码
        System.out.println(Thread.currentThread().getName());
    }
}
class MyRunnable  implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
