package study.day14;

import java.io.IOException;

//java中如何开启一个进程:运行记事本程序
public class ProcessDemo {
    public static void main(String[] args) throws IOException {
        //方法1:使用Runtime的exec方法
        Runtime runtime = Runtime.getRuntime();
        runtime.exec("notepad");
        //方式2:ProcessBuilder的start方法
        ProcessBuilder processBuilder = new ProcessBuilder("notepad");
        processBuilder.start();
    }

}
