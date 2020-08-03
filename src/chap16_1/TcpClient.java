package chap16_1;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

/*
基于TCP客户端开发
1 创建客户单接字，并制定服务器的地址和端口号
2 获取输出流，发送数据给服务器
3 获取输入流 读取服务器回复的数据
4 关闭释放资源
 */
public class TcpClient {
    public static void main(String[] args) throws Exception{
//        1 创建客户单接字，并制定服务器的地址和端口号
        Socket socket = new Socket("192.168.1.103",8899);
//        2 获取输出流，发送数据给服务器
        OutputStream os = socket.getOutputStream();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os,"utf-8"));
        bw.write("后就不见");
//        3 获取输入流 读取服务器回复的数据[可选]
//        4 关闭释放资源
        bw.close();
        socket.close();
    }

}