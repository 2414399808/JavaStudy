package d2_udp1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Arrays;

/**
 * 接收端
 */
public class ServerDemo {
    public static void main(String[] args) throws Exception {
        System.out.println("=========服务端启动=========");
        //1 创建接收端对象 注册端口（人）
        DatagramSocket socket=new DatagramSocket(8888);
        //2 创建一个数据包对象
        byte[] buffer = new byte[1024*64];
        DatagramPacket packet=new DatagramPacket(buffer,buffer.length);
        //等待接收数据即可
        socket.receive(packet);

        //4 取出数据即可
        //读取多少 写多少
        int len= packet.getLength();
        System.out.println(new String(buffer,0,len));

        //获取发送端的ip和端口
        System.out.println(packet.getSocketAddress());
        socket.close();
    }
}
