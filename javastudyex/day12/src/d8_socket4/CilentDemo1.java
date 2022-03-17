package d8_socket4;

import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

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
        Scanner sc=new Scanner(System.in);
        //4 发送消息
        while (true) {
            System.out.println("请输入您想要发送的数据");
            String s = sc.nextLine();
            ps.println(s);
            ps.flush();
        }

        //不建议大家关闭管道(流水线通信)




    }
}
