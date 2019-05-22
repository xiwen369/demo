package study.Day22;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        //创建客户端对象
        Socket client = new Socket("localhost", 8888);
        //获取客户端的输入流对象
        Scanner in = new Scanner(client.getInputStream());
        while (in.hasNextLine()){
            String s = in.nextLine();
            System.out.println(s);
        }
        in.close();
        client.close();
    }
}
