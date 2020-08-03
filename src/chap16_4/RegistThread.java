package chap16_4;

import javax.sound.midi.Soundbank;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties;

public class RegistThread extends Thread{
    @Override
    public void run() {
        try {
            //1 创建serverSocket
            ServerSocket listerner = new ServerSocket(6666);
            //2 调用accept方法
            System.out.println("注册服务器已启动");
            Socket socket=listerner.accept();
            //3 获取输入输出流
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(),"utf-8"));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(),"utf-8"));
            //4 接收客户端发送的请求
            String json = br.readLine();
            String[] infos = json.substring(1,json.length()-1).split(",");
            String id = infos[0].split(":")[1];
            System.out.println("取出ID是："+id);
            // 5 加载属性文件
            Properties properties=Tools.loadProperties();
            System.out.println("读取文件中的内容是:"+properties);
            //6判断
            if (properties.containsKey(id)){
                //有
                bw.write("此用户已存在");
            }else {
                //保存功能
                Tools.saveProperties(json);
                bw.write("注册成功");
            }
            bw.newLine();
            bw.flush();
            bw.close();
            br.close();
            socket.close();
            listerner.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
