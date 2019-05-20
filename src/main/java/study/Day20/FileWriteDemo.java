package study.Day20;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo {
    public static void main(String[] args) throws IOException {
        //1.创建目标
        File file = new File("D:/ideaProject/demo/file/stream.txt");
        //2.创建流对象
        FileWriter out = new FileWriter(file);
        //3.写出操作
        /**
         * write(int c)
         * write(char[] c)
         * write(char[] c,int off,int len)
         * write(String str)
         * */
        out.write("徐");
        out.write("xiwen".toCharArray());
        out.write("xiwen".toCharArray(),0,2);
        out.write("牛逼");
        //4.关闭流
        out.close();
    }
}
