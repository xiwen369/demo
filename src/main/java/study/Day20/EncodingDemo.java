package study.Day20;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class EncodingDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String msg = "徐伟";
        //编码操作String-->byte[]
        byte[] bytes = msg.getBytes("UTF-8");
        System.out.println(Arrays.toString(bytes));

        //解码操作byte[]-->String
        //因为服务器都是老外写的,老外用的都是ISO-8859-1
        String s = new String(bytes,"ISO-8859-1");
        System.out.println(s);

        //解决方案
        //1.先转回byte[]
        byte[] bytes1 = s.getBytes("ISO-8859-1");
        System.out.println(Arrays.toString(bytes1));
        //2.再转成UTF-8
        String s1 = new String(bytes1,"UTF-8");
        System.out.println(s1);

    }
}
