package study.Day22;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        String data = "你好!";
        //创建服务端,指定端口为8888
        ServerSocket server = new ServerSocket(8888);
        System.out.println("客户端已经准备就绪...");
        //接收连接该服务端的客户端对象
        boolean accept = true;
        while (accept){
            Socket client = server.accept();
            System.out.println("连接过来的客户端:"+client.getInetAddress());
            //获取该客户端的输出流对象,给该客户端输出数据
            PrintStream out = new PrintStream(client.getOutputStream());
            out.print(data);
            out.close();
        }
        server.close();
    }
}
