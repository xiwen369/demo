package study.Day19;

import java.io.File;

//系统平台的分隔符
public class FileDemo {
    public static void main(String[] args) {
        /**
         字段摘要
         static String pathSeparator
         static char   pathSeparatorChar
         static String separator
         static char   separatorChar
         * */
        //获取属性分隔符
        String pathSeparator = File.pathSeparator;
        char pathSeparatorChar = File.pathSeparatorChar;
        System.out.println(pathSeparator+"-----"+pathSeparatorChar);
        //获取路径分隔符
        String separator = File.separator;
        char separatorChar = File.separatorChar;
        System.out.println(separator+"-----"+separatorChar);
        //表示文件的路径
        String path = "c:\\will\\123.txt";
        String path1 = "c:/will/123.txt"; //推荐
        String path2 = "c:"+ File.separator+"+will"+File.separator+"123.txt";

        File file = new File("c:/will/123.txt");

    }
}
