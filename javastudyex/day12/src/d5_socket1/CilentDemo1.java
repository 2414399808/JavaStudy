package d5_socket1;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * 目标 完成Socklet网络编程入门案例的客户端开发 实现一发一收
 */
public class CilentDemo1 {
    public static void main(String[] args) throws Exception {
        System.out.println("==========客户端启动成功==========");
        //1 创建Socket通信管道请求有服务端的链接
        //参数一 服务端的IP地址
        //参数二 服务端的端口
        Socket socket=new Socket(InetAddress.getLocalHost(),7777);
        //2从socket通信管道中得到一个字节输出流 负责发送数据
        OutputStream os = socket.getOutputStream();

        //3 把低级的字节流包装成打印流
        PrintStream ps=new PrintStream(os);
        //4 发送消息
        ps.println("我是TCP的客户端，我已经与你对接，并发出邀请");
        ps.flush();

        //不建议大家关闭管道(流水线通信)




    }
}
