package study.Day19;

import java.io.File;
import java.io.FileOutputStream;

public class FileDemo1 {
    public static void main(String[] args) throws Exception {
        //1:创建目标对象(表示把数据保存到哪一个文件)
        File file = new File("file/stream.txt");
        //2:创建文件字节流输出对象(水管),true表示需追加文件内容
        FileOutputStream out = new FileOutputStream(file,true);
        //3:具体的输出操作(往外写操作)
        /**
         void write(int b)
         void write(byte[] b)
         void write(byte[] b, int off, int len)
         * */
        out.write(65);
        out.write("ABCD".getBytes());
        out.write("ABCD".getBytes(),0,2);
        //4:关闭资源对象
        out.close();
    }
}
