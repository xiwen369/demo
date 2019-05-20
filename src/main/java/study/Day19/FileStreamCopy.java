package study.Day19;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//文件字节流拷贝和正确的关闭源
public class FileStreamCopy {
    public static void main(String[] args) {
        FileInputStream in = null;
        FileOutputStream out =null;
        try{
            //1.创建源/目标
            File file = new File("D:/ideaProject/demo/file/stream.txt");
            File file1 = new File("D:/ideaProject/demo/file/streamCopy.txt");
            //2.创建水管对象(字节输入/输出流对象,并接到源上)
            in = new FileInputStream(file);
            out = new FileOutputStream(file1);
            //3.输入操作
            byte[] bytes = new byte[10];
            int len = -1;
            while ((len = in.read(bytes)) != -1) {
                String str = new String(bytes,0,len);
                System.out.println(str);
                out.write(bytes,0,len);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //4.关闭源
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
