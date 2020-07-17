package lesson7;

import java.util.concurrent.*;

/**
 * Created by Deerlet-7 on 2020/5/3 14:42
 */
public class ThreadPoolExcutorTest {
    public static void main(String[] args) {
        ExecutorService pool = new ThreadPoolExecutor(//线程池---快递公司
                3,//核心线程数（正式员工）：创建好线程池，正式员工就开始取快递

                //临时工雇佣：正式员工忙不过来，就会创建临时工
                //临时工解雇：空闲时间超出设置时间范围，就解雇
                5,//最大线程数（最多数量的员工：正式员工+临时工）

                30,//时间数量
                TimeUnit.SECONDS,//时间单位（时间数量+时间单位表示一定范围时间）

                //阻塞队列：存放包裹的仓库，存放任务的数据结构
                new ArrayBlockingQueue<>(1000),

                //（了解）线程池创建Thread线程类的工厂类，没有提供的话就使用线程池内部默认的创建线程方式
                new ThreadFactory() {
                    @Override
                    public Thread newThread(Runnable r) {
                        return null;
                    }
                },
                //拒绝策略：
                //CallerRunsPolicy:仓库已满，哪个线程（execute代码行所在的线程）在让我去送快递，就由该线程自己完成
                //AbortPolicy：直接抛出异常 RejectedExecutionException
                //DiscardPolicy：从阻塞时队列丢弃最新的任务 把当前任务加进去
                //DiscardOldestPolicy：从阻塞时队列丢弃最旧的任务 把当前任务加进去
                new ThreadPoolExecutor.DiscardOldestPolicy()
        );
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
