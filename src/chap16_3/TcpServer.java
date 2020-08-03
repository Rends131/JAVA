package chap16_3;

import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
    public static void main(String[] args) throws Exception{
        //1 创建Secersocket
        ServerSocket listerner = new ServerSocket(10086);
        //2 调用accept，接收客户端请求
        System.out.println("服务器启动");
        while (true){
            Socket socket=listerner.accept();
            System.out.println(socket.getInetAddress()+"进来了-------");
            //创建线程对象，负责接收数据
            new SocketThread(socket).start();
        }

    }
}
