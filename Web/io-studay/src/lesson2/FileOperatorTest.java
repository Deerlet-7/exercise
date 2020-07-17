package lesson2;

import org.junit.Test;
import sun.usagetracker.UsageTrackerClient;

import java.io.*;

/**
 * Created by Deerlet-7 on 2020/6/5 14:05
 */
public class FileOperatorTest {
    @Test
    public void fileRead_1() throws IOException {
        //字节流转换为字符流，需要使用字节字符转换流
        //InputStreamReader：输入的字节字符转换流；OutputStreamReader：输出的字节字符转换流
        FileInputStream fis = new FileInputStream(
                new File("F:\\git\\exercise\\Web\\io-studay\\res\\info.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(fis,"UTF-8"));//把上面读取到的二进制字节流，缓冲为字符流（InputStreamReader为字符字节转换流）
        /*字符流按行读取
        String line;
        while ((line = br.readLine()) != null){
            System.out.println(line);
        }*/
        //字符流按字符数组读取
        char[] chars = new char[1024];
        int len = 0;
        while ((len = br.read(chars,0,1024)) != -1){
            String str = new String(chars );
            System.out.println(str);
        }
    }
    @Test
    public void fileRead_2() throws IOException {
        FileInputStream fis = new FileInputStream(
                new File("F:\\git\\exercise\\Web\\io-studay\\res\\info.txt"));
        //按字节读取
        byte[] bytes = new byte[1024];
        int len;
        while ((len = fis.read(bytes,0,1024)) != -1){
            String str = new String(bytes,0,len);
            System.out.println(str);
        }
    }
    @Test
    public void fileWrite_1() throws IOException {
        FileOutputStream fos = new FileOutputStream(
                new File("F:\\git\\exercise\\Web\\io-studay\\res\\info.txt"));
        BufferedWriter br = new BufferedWriter(new OutputStreamWriter(fos,"UTF-8"));
        //使用缓冲流，输出的时候，要进行flush刷新缓冲区，否则不会真实输出数据到目的设备
        br.write("1:放回去\n");//写到系统缓冲区内存
        br.write("2:彻底佛i耳机\n");
        br.write("3:joirghwoirg\n");
        br.flush();//缓冲区刷新，发送数据倒目的设备
    }
    @Test
    public void copyFile() throws IOException {
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        try {
            //复制本地文件到另一个地方
             fis = new FileInputStream(
                    new File("F:\\git\\exercise\\Web\\io-studay\\res\\info.txt"));
             bis = new BufferedInputStream(fis);
             fos = new FileOutputStream(
                    new File("F:\\git\\exercise\\Web\\io-studay\\res\\info1.txt"));
             bos = new BufferedOutputStream(fos);
            byte[] bytes = new byte[1024 * 8];
            int len;
            while ((len = fis.read(bytes, 0, 1024)) != -1) {
                bos.write(bytes);
                bos.flush();
            }
        } finally {//io流操作完成后，一定要释放资源，顺序根据依赖关系反向释放
            if(bis != null)
                bis.close();
            if(fis != null)
                fis.close();
            if(bos != null)
                bos.close();
            if(fos != null)
                fos.close();
        }
    }
}
