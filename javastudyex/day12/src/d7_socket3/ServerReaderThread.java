package d7_socket3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerReaderThread extends Thread{
    private Socket socket;

    public ServerReaderThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {


            //3 从Socket通信管道中得到一个字节输入流
            InputStream is=socket.getInputStream();
            // 4 把字节输入流包装成缓冲字符输入流进行消息的接收
            BufferedReader br= new BufferedReader(new InputStreamReader(is));
            //5按行读取消息
            String msg;
            while((msg=br.readLine())!=null){
                System.out.println(socket.getRemoteSocketAddress()+"说了："+msg);
            }
        } catch (IOException e) {
            System.out.println(socket.getRemoteSocketAddress()+"下线了");
        }
    }
}
