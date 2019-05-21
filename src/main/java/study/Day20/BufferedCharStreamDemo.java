package study.Day20;

import java.io.*;

//字符缓冲流
public class BufferedCharStreamDemo {
    public static void main(String[] args) throws IOException {
        //字符缓冲输出流
        BufferedWriter out = new BufferedWriter(new FileWriter("D:/ideaProject/demo/file/stream.txt", true));
        out.write("好好学习");
        out.newLine();
        out.write("天天向上！");
        out.close();

        //字符缓冲输入流
        BufferedReader in = new BufferedReader(new FileReader("D:/ideaProject/demo/file/stream.txt"));
        //方式1
//        int len = -1;
//        char[] chars = new char[1024];
//        while ((len = in.read(chars)) != -1) {
//            System.out.println(new String(chars, 0, len));
//        }
        //方式2
        String line = null;
        while ((line=in.readLine())!=null){
            System.out.println(line);
        }
        in.close();
    }
}
