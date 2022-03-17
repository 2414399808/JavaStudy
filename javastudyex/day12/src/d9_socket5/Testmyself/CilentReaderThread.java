package d9_socket5.Testmyself;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class CilentReaderThread extends Thread{
    private Socket socket;
    public CilentReaderThread(Socket socket){
        this.socket=socket;
    }

    @Override
    public void run() {
        try {
            BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String msg;
            while((msg=br.readLine())!=null){
                System.out.println("收到消息"+msg);
            }
        } catch (IOException e) {
            System.out.println("你被服务器给踢走了");
        }
    }
}
