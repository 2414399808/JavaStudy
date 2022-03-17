package d5_socket1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 目标 开发Socket网络编程入门代码 的服务端代码 实现接收消息
 */
public class ServerDemo1 {
    public static void main(String[] args) throws Exception {
        System.out.println("==========服务端启动成功=========");
        //1 注册端口
        ServerSocket serverSocket=new ServerSocket(7777);
        //2 必须调用accept方法 等待接受客户端的Socket链接请求 建立Socket通信管道
        Socket socket=serverSocket.accept();

        //3 从Socket通信管道中得到一个字节输入流
        InputStream is=socket.getInputStream();
        // 4 把字节输入流包装成缓冲字符输入流进行消息的接收
        BufferedReader br= new BufferedReader(new InputStreamReader(is));
        //5按行读取消息
        String msg;
        if((msg=br.readLine())!=null){
            System.out.println(socket.getRemoteSocketAddress()+"说了："+msg);
        }

    }
}
