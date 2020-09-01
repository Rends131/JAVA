package chap16.chap16_2;

import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TcpFileClient {
    public static void main(String[] args) throws Exception{
        Socket socket=new Socket("192.168.1.103",9999);

        OutputStream os = socket.getOutputStream();

        FileInputStream fis = new FileInputStream("d:\\001.jpg");
        byte[] buf =new byte[1024*4];
        int count=0;
        while ((count=fis.read(buf))!=-1){
            os.write(buf,0,count);
        }
        fis.close();
        os.close();
        socket.close();
        System.out.println("f发送冲个");
    }
}
