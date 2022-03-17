package d7_socket3.testmysel;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerThread extends Thread{
    private Socket socket;
    public ServerThread(Socket socket){
        this.socket=socket;
    }

    @Override
    public void run() {
        try {
            InputStream inputStream = socket.getInputStream();
            BufferedReader br=new BufferedReader(new InputStreamReader(inputStream));
           String msg;
           while ((msg=br.readLine())!=null){
               System.out.println(socket.getRemoteSocketAddress()+msg);
           }
        } catch (IOException e) {
            System.out.println(socket.getRemoteSocketAddress()+"下线了");
        }

    }
}
