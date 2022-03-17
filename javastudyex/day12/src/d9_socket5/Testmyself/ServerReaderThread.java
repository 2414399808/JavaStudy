package d9_socket5.Testmyself;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerReaderThread extends Thread{
    private Socket socket;
    public ServerReaderThread(Socket socket){
        this.socket=socket;
    }

    @Override
    public void run() {
        try {
            BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String msg;
            while((msg=br.readLine())!=null){
                System.out.println(socket.getRemoteSocketAddress()+msg);

                    sendallMsg(msg);

            }
        } catch (IOException e) {
            System.out.println(socket.getRemoteSocketAddress()+"下线了");
        }
    }

    private void sendallMsg(String msg) throws IOException {
        for (Socket allOnlinSocket : ServerDemo1.allOnlinSockets) {
            OutputStream outputStream = allOnlinSocket.getOutputStream();
            PrintStream ps=new PrintStream(outputStream);
            ps.println(msg);
        }
    }
}
