package study.Day20;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReadDemo {
    public static void main(String[] args) throws IOException {
        //1.创建源
        File file = new File("D:/ideaProject/demo/file/stream.txt");
        //2.创建流对象
        FileReader in = new FileReader(file);
        //3.读取操作
        int len = -1;
        char[] chars = new char[5];
        len = in.read(chars);
        while (len!=-1){
            System.out.println(chars);
            len = in.read(chars);
        }
        //4.关闭流
        in.close();
    }
}
