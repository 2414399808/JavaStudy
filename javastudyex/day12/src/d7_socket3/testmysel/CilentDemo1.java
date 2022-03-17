package d7_socket3.testmysel;

import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class CilentDemo1 {
    public static void main(String[] args) throws Exception {
        Socket socket=new Socket(InetAddress.getLocalHost(),1111);

        OutputStream outputStream = socket.getOutputStream();
        PrintStream ps=new PrintStream(outputStream);
        Scanner sc=new Scanner(System.in);
        while(true){

            System.out.println("请您在这输入消息：");
            String msg=sc.nextLine();
            ps.println(msg);
            ps.flush();
        }
    }
}
