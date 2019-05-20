package study.Day19;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;

public class InPutStreamDemo {
    public static void main(String[] args) throws Exception {
        //1.创建源-挖井
        File file = new File("D:/ideaProject/demo/file/stream.txt");
        //2.创建文件字节输入流对象,并接在源上
        FileInputStream in = new FileInputStream(file);
        //3.具体读取操作
        /**
         int read()
         从此输入流中读取一个数据字节。
         int read(byte[] b)
         从此输入流中将最多 b.length 个字节的数据读入一个 byte 数组中。
         int read(byte[] b, int off, int len)
         从此输入流中将最多 len 个字节的数据读入一个 byte 数组中。
         **/
        int ret = in.read();
        System.out.println(ret);
        byte[] bytes = new byte[5];
        byte[] bytes1 = new byte[5];
        in.read(bytes);
        System.out.println(Arrays.toString(bytes));
        in.read(bytes1,1,2);
        System.out.println(Arrays.toString(bytes1));
        //4.关闭源
        in.close();
    }
}
