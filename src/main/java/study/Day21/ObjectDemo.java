package study.Day21;

import java.io.*;

//对象流-序列化和反序列化
public class ObjectDemo {
    public static void main(String[] args) throws Exception {
        File file = new File("file/stream.txt");
//        writeObject(file);
        readObject(file);
    }

    //反序列化操作
    private static void readObject(File file) throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
        User user = (User) in.readObject();
        System.out.println(user);
    }

    //序列化操作
    private static void writeObject(File file) throws Exception {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
        out.writeObject(new User("xuwei",18));
        out.close();
    }
}
