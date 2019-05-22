package study.Day22;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Sender {
    public static void main(String[] args) throws Exception {
        String data = "你好啊!";
        //创建发送端对象
        DatagramSocket sender = new DatagramSocket(10010);
        //发送数据
        DatagramPacket dp = new DatagramPacket(data.getBytes(),
                data.getBytes().length,
                InetAddress.getLocalHost(),//发送给哪个ip
                10086);//发送给哪个端口
        sender.send(dp);
        sender.close();
    }
}
