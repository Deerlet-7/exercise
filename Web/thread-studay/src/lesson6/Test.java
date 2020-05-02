package lesson6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Deerlet-7 on 2020/5/2 16:29
 */
public class Test {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(4);//创建线程池
        pool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("送快递去北京，A同学");
            }
        });
        pool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("送快递到新疆，B同学");
            }
        });
        System.out.println("我正在做的事");
    }
}
