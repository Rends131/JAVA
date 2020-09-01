package chap16.chap16_1;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
    public static void main(String[] args) throws Exception{
        // 1 创建 serversocket 并制定端口号
        ServerSocket listener = new ServerSocket(8899);
        //2 调用accept，接收客户端请求 ，阻塞方法（如果客户端没有请求，则阻塞）
        System.out.println("服务器已启动...");
        Socket socket = listener.accept();
        //3 获取输入流，读取客户单发送的数据
        InputStream is = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is,"utf-8"));
        String data = br.readLine();
        System.out.println("客户发送"+data);
        // 4 获取输出流，发送数据给客户地段
        //5 关闭释放资源
        br.close();
        socket.close();
        listener.close();
    }

}
