package d5_socket1.Test;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class CilentDemo1 {
    public static void main(String[] args) throws Exception {
        Socket socket=new Socket(InetAddress.getLocalHost(),9999);

        OutputStream outputStream = socket.getOutputStream();

        PrintStream ps=new PrintStream(outputStream);

        ps.println("这是我的测试TCP通信请求链接");

        ps.flush();
    }
}
