package d7_socket3.testmysel;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo1 {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket=new ServerSocket(1111);

       while(true){
           Socket socket = serverSocket.accept();
           System.out.println(socket.getRemoteSocketAddress()+"上线了");
           Thread thread=new ServerThread(socket);
           thread.start();
       }
    }
}
