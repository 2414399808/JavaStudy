package d7_socket3;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 目标 实现服务端可以同时处理多个客户端的消息
 */
public class ServerDemo1 {
    public static void main(String[] args) throws Exception {
        System.out.println("==========服务端启动成功=========");
        //1 注册端口
        ServerSocket serverSocket=new ServerSocket(7777);
            //a 定义一个死循环由主线程负责不断的接收客户端的Socket管道链接
        while (true) {

            //2 必须调用accept方法 等待接受客户端的Socket链接请求 建立Socket通信管道
            Socket socket=serverSocket.accept();
            System.out.println(socket.getRemoteSocketAddress()+"他来了");
            //2 每接收到一个客户端的Socket管道 交给一个独立的子线程负责读取消息
           Thread t=new ServerReaderThread(socket);
           t.start();
        }

    }
}
