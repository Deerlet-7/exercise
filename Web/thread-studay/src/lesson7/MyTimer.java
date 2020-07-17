package lesson7;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Deerlet-7 on 2020/5/3 15:42
 * 定时器
 * 1、在约定好的某个时间点 执行某个任务
 * 2、间隔时间到了 不停的执行任务
 */
public class MyTimer {
    public void schedule(Runnable task,long delay,long period){
        try {
            Thread.sleep(delay);
            new Thread(task).start();
            while (period > 0){
                Thread.sleep(period);
                new Thread(task).start();
            }
        } catch (InterruptedException e) {
             e.printStackTrace();
        }
        long current = System.currentTimeMillis();
    }
    //jdk的时间操作
    public static void main(String[] args) {
        //Date
        Date date1 = new Date();//无参构造，返回系统当前时间
        Date date2 = new Date(99999999);//以格林威治时间1970-01-01开始 经过给定时间数量的毫秒
        //DateFormat
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        System.out.println(df.format(date1));
//        System.out.println(df.format(date2));
        //System时间获取:从1970-01-01开始到当前时间点经过的毫秒数
        long current = System.currentTimeMillis();
/*        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("起床了");
            }
        };
        new Timer().schedule(task,3000,1000);*/
        new MyTimer().schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("起床了");
            }
        },3000,1000);
    }
}
