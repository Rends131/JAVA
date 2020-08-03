package chap16_3;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

/*

 */
public class TcpClient {
    public static void main(String[] args) throws Exception{
        //1创建socket
        Socket socket=new Socket("192.168.1.103",10086);
        //2 获取输出流
        OutputStream os = socket.getOutputStream();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os,"utf-8"));
        //3控制输入
        Scanner input=new Scanner(System.in);
        while (true){
            String data = input.nextLine();
            bw.write(data);
            bw.newLine();
            bw.flush();
            if(data.equals("886")||data.equals("byebye")){
                break;
            }
        }
        //4guanbi
        bw.close();
        socket.close();
    }
}
