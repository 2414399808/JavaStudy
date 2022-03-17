package d9_socket5;

import java.io.*;
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
                //把这个消息进行端口转发给全部客户端Socket管道
                sendMsgToAll(msg);
            }
        } catch (IOException e) {
            System.out.println(socket.getRemoteSocketAddress()+"下线了");
            ServerDemo1.allOnlineSockets.remove(socket);
        }
    }

    private void sendMsgToAll(String msg) throws IOException {
        for (Socket allOnlineSocket : ServerDemo1.allOnlineSockets) {
            OutputStream outputStream = allOnlineSocket.getOutputStream();
            PrintStream ps=new PrintStream(outputStream);
            ps.println(msg);
            ps.flush();

        }
    }
}
