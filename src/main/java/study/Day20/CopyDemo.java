package study.Day20;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.util.Arrays;

//需求:文件拷贝案例-拷贝指定目录的指定类型文件到指定目录
public class CopyDemo {
    public static void main(String[] args) throws Exception {
        //1.找到源目录中所有的java文件
        File srcDir = new File("java");
        File destDir = new File("text");
        File file = new File("java");
        File[] fs = file.listFiles(new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return new File(dir, name).isFile() && name.endsWith(".java");
            }
        });
        System.out.println(Arrays.toString(fs));
        //2.迭代出每一个文件对象,并拷贝
        for (File srcFile : fs) {
            FileInputStream in = new FileInputStream(srcFile);
            FileOutputStream out = new FileOutputStream(new File(destDir, srcFile.getName()));
            byte[] bytes = new byte[1024];//一次性读取1024个字节
            int len = -1;//表示已经读取的字节数,在底层规定-1读取到末尾
            len = in.read(bytes);
            while (len!=-1){
                out.write(bytes,0,len);
                len = in.read(bytes);
            }
            in.close();
            out.close();
        }

    }

}
