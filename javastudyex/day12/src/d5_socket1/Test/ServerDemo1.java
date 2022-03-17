package d5_socket1.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo1 {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket=new ServerSocket(9999);

        Socket socket = serverSocket.accept();

        InputStream inputStream = socket.getInputStream();

        BufferedReader br=new BufferedReader(new InputStreamReader(inputStream));

        String msg;
        if((msg=br.readLine())!=null){
            System.out.println(socket.getRemoteSocketAddress()+msg);
        }
    }
}
