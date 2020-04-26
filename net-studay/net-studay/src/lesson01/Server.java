package lesson01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Deerlet-7 on 2020/4/26 12:50
 */
public class Server {
    private static final int PORT = 9000;
    //线程放线程池里 避免一个线程阻塞影响main线程
    private static final ExecutorService POOL = Executors.newCachedThreadPool();
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(9000);
        while (true){
            //返回客户端对象 client:客户端的数据包相关内容封装在对象内
            Socket client = server.accept();//阻塞等待，直到有新的客户端连接
            POOL.execute(new Task(client));
        }
    }
    //处理client里IO流数据
    private static class Task implements Runnable{
        private Socket client;
        public Task(Socket client) {
            this.client = client;
        }
        @Override
        public void run() {
            try {
                BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
                //true:每次都自动刷新一下发送到对应主机
                PrintWriter out = new PrintWriter(client.getOutputStream(),true);
                // PrintWriter out = new PrintWriter(client.getOutputStream());//数据发送到系统的缓存区 下一步还要进行数据发送到网络远程主机操作
                String str;
                //阻塞等待客户端数据的输入
                while ((str = in.readLine()) != null){//io流在结束时，返回才是null
                    System.out.println(str);
                    out.println("是啦啦啦");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

