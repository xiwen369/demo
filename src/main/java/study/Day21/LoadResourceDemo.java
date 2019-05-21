package study.Day21;

import java.io.FileInputStream;
import java.util.Properties;

public class LoadResourceDemo {
    public static void main(String[] args) throws Exception {
        //创建Properties对象
        Properties p = new Properties();
        FileInputStream in = new FileInputStream("src/db.properties");
        //加载输入流中的数据，加载之后，数据都在p对象中
        p.load(in);
        System.out.println(p);
        System.out.println("账号="+p.getProperty("username"));
        System.out.println("密码="+p.getProperty("password"));


    }
}
