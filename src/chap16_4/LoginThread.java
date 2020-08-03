package chap16_4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties;

public class LoginThread extends Thread{
    @Override
    public void run() {
        super.run();
        try {
            //1 创建serverSocket
            ServerSocket listerner = new ServerSocket(7777);
            //2 调用accept方法
            System.out.println("登录服务器已启动");
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
            //6判断账号密码是否存在
            if (properties.containsKey(id)){
                //判断密码是否正确
                String pwd = infos[1].split(":")[1];

                String value=properties.getProperty(id);
                String[] arr=value.substring(1,value.length()-1).split(",");
                String pwd2=arr[2].split(":")[1];
                if (pwd.equals(pwd2)){
                    bw.write("登录成功");
                }else {
                    bw.write("登录失败");
                }
            }else {
                //保存功能
                Tools.saveProperties(json);
                bw.write("用户名或密码错误");
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
