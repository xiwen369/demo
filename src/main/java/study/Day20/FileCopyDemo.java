package study.Day20;

import java.io.*;

public class FileCopyDemo {
    public static void main(String[] args) throws IOException {
        //1.创建源/目标D:/idea
        File srcFile = new File("D:/ideaProject/demo/file/stream.txt");
        File destFile = new File("D:/ideaProject/demo/file/streamCopy2.txt");
        //2.创建输入流/输出流对象
        FileReader in = new FileReader(srcFile);
        FileWriter out = new FileWriter(destFile);
        //3.输入/输出操作
        char[] chars = new char[10];
        int len = -1;
        while ((len = in.read(chars))!=-1){
            out.write(chars,0,len);
        }
        //4.关闭流
        in.close();
        out.close();
    }
}
