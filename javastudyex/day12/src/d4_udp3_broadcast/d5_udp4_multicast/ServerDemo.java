package d4_udp3_broadcast.d5_udp4_multicast;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

/**
 * 接收端
 */
public class ServerDemo {
    public static void main(String[] args) throws Exception {
        System.out.println("=========服务端启动=========");
        //1 创建接收端对象 注册端口（人）
        MulticastSocket socket=new MulticastSocket(8888);

        //把当前接受端加入到一个组播组中绑定对应的组播消息的组播ip

        socket.joinGroup(InetAddress.getByName("224.0.1.1"));
        //2 创建一个数据包对象
        byte[] buffer = new byte[1024*64];
        DatagramPacket packet=new DatagramPacket(buffer,buffer.length);
        //等待接收数据即可
        while (true) {
            socket.receive(packet);

            //4 取出数据即可
            //读取多少 写多少
            int len= packet.getLength();
            System.out.println("收到了来自"+packet.getSocketAddress()+"的消息"+new String(buffer,0,len));



        }

    }
}
