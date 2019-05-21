package study.Day21;

import java.io.FileInputStream;
import java.io.PrintStream;

//标准IO操作
public class SystemIODemo {
    public static void main(String[] args) throws Exception {
        //重定向标准输入流
        System.setIn(new FileInputStream("file/stream.txt"));
        //重定向标准输出流
        System.setOut(new PrintStream("file/streamCopy4.txt"));

        int data = System.in.read();
        System.out.println(data);
    }
}
