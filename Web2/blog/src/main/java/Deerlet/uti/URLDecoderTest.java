package Deerlet.uti;

import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;

/**
 * Created by Deerlet-7 on 2020/7/28 20:20
 */
public class URLDecoderTest {
    public static void main(String[] args) throws UnsupportedEncodingException {
        URL url = URLDecoderTest.class.getClassLoader().getResource("Program Files/随便.txt");
        System.out.println(url.getPath());
        String path = URLDecoder.decode(url.getPath(),"UTF-8");
        System.out.println(path);
    }
}
