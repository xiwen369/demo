package study.Day20;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//字节缓冲流
public class BufferedStreamDemo {
    public static void main(String[] args) throws Exception {
        //字节缓冲输出流
        BufferedOutputStream bout =
                new BufferedOutputStream(new FileOutputStream("D:/ideaProject/demo/file/stream.txt", true));
        bout.write("abcd".getBytes());
        bout.close();

        //字节缓冲输入流
        BufferedInputStream bin =
                new BufferedInputStream(new FileInputStream("D:/ideaProject/demo/file/streamCopy.txt"));
        byte[] bytes = new byte[1024];
        int len = -1;
        while ((len = bin.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }
        bin.close();
    }
}
