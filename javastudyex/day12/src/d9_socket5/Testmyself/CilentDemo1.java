package d9_socket5.Testmyself;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class CilentDemo1 {
    public static void main(String[] args) throws Exception {
        System.out.println("============客户端开启============");
        Socket socket=new Socket(InetAddress.getLocalHost(),8888);
        new CilentReaderThread(socket).start();
        OutputStream outputStream = socket.getOutputStream();
        PrintStream ps=new PrintStream(outputStream);
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("请在这里输入消息");
            String msg = sc.nextLine();
            ps.println(msg);
            ps.flush();
        }

    }
}
