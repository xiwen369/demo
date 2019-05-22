package study.Day22;


import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Recive {
    public static void main(String[] args) throws Exception {
        //创建接收端对象
        DatagramSocket reciver = new DatagramSocket(10086);
        byte[] bytes = new byte[1024];
        //接收数据
        DatagramPacket dp = new DatagramPacket(bytes,1024);
        reciver.receive(dp);
        //获取接收的数据
        String s = new String(dp.getData(),0,dp.getLength());
        System.out.println("发送过来的数据="+s);

    }
}
