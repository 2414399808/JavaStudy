package d9_socket5.Testmyself;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ServerDemo1 {
    public static List<Socket> allOnlinSockets=new ArrayList<>();
    public static void main(String[] args) throws Exception {
        System.out.println("=============服务器端开启==============");
        ServerSocket serverSocket=new ServerSocket(8888);

        while (true) {
            Socket socket = serverSocket.accept();
            allOnlinSockets.add(socket);
            System.out.println(socket.getRemoteSocketAddress()+"上线了");
            ServerReaderThread serverReaderThread = new ServerReaderThread(socket);
            serverReaderThread.start();
        }
    }
}
