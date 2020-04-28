package lesson01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by Deerlet-7 on 2020/4/26 13:37
 */
public class Client {
    //主机
    private static final String HOST = "127.0.0.1";
    //端口号
    private static final int PORT = 9000;

    public static void main(String[] args) throws IOException {
        Socket client = new Socket(HOST,PORT);
        BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        PrintWriter out = new PrintWriter(client.getOutputStream(),true);
        out.println("我司案发");
        String str;
        //阻塞等待服务端
        while ((str = in.readLine()) != null){
            System.out.println(str);
        }
    }
}
