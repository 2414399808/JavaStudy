package d8_socket4.testMyself;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

public class ServerDemo1 {
    private static ExecutorService pool= new ThreadPoolExecutor(3,5,6, TimeUnit.SECONDS,new ArrayBlockingQueue<>(2),
            Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket=new ServerSocket(8888);

        while (true) {
            Socket socket = serverSocket.accept();
            System.out.println(socket.getRemoteSocketAddress()+"上线了");
            pool.execute(new ServerReaderRunnable(socket));
        }


    }
}
