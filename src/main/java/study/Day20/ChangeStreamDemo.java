package study.Day20;

import java.io.*;

public class ChangeStreamDemo {
    public static void main(String[] args) throws Exception {
        File srcFile = new File("D:\\ideaProject\\demo\\file\\stream.txt");
        File destFile = new File("D:\\ideaProject\\demo\\file\\streamCopy3.txt");
        InputStreamReader in = new InputStreamReader(new FileInputStream(srcFile), "UTF-8");
        OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(destFile), "UTF-8");

        //接下来就是字符流的操作
        char[] chars = new char[1024];
        int len = -1;
        while ((len = in.read(chars)) != -1) {
            out.write(chars,0,len);
        }

        //关闭流
        in.close();
        out.close();
    }
}
