package chap16_2;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
服务器端
 */
public class TcpServer {
    public static void main(String[] args) throws Exception{
        //1 创建serversocket
        ServerSocket listener = new ServerSocket(9999);
        //2 监听，接收客户端请求
        System.out.println("服务器启动");
        Socket socket = listener.accept();
        //3 获取输入流
        InputStream is = socket.getInputStream();
        //4 便读取便保存
        FileOutputStream fos = new FileOutputStream("d:\\002.jpg");
        byte[] buf = new byte[1024*4];
        int count=0;
        while ((count=is.read(buf))!=-1){
            fos.write(buf,0,count);
        }
        //5 关闭
        fos.close();
        is.close();
        socket.close();
        listener.close();
        System.out.println("接收完毕");
    }
}
