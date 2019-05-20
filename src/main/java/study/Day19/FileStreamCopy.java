package study.Day19;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileStreamCopy {
    public static void main(String[] args) throws Exception {
        //1.创建源/目标
        File file = new File("D:/ideaProject/demo/file/stream.txt");
        File file1 = new File("D:/ideaProject/demo/file/streamCopy.txt");
        //2.创建水管对象(字节输入/输出流对象,并接到源上)
        FileInputStream in = new FileInputStream(file);
        FileOutputStream out = new FileOutputStream(file1);
        //3.输入操作
        byte[] bytes = new byte[10];
        int len = -1;
        while ((len = in.read(bytes)) != -1) {
            String str = new String(bytes,0,len);
            System.out.println(str);
            out.write(bytes,0,len);
        }
        //4.关闭源
        in.close();
    }
}
