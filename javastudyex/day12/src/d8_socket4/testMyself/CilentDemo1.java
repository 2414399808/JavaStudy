package d8_socket4.testMyself;

import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class CilentDemo1 {
    public static void main(String[] args) throws Exception {
        Socket socket=new Socket(InetAddress.getLocalHost(),8888);

        PrintStream ps=new PrintStream(socket.getOutputStream());

        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("请您输入消息");
            String msg=sc.nextLine();
            ps.println(msg);
        }
    }
}
