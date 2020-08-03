package chap16_4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class UserClient {
    public static void main (String[] args) throws Exception{
        System.out.println("----------请选择1，注册  2登录--------");
        Scanner input=new Scanner(System.in);
        int choice = input.nextInt();
        switch (choice){
            case 1:
                regist();
                break;
            case 2:
                login();
            default:
                break;
        }

    }
    public static void regist() throws Exception{
        //1创建Socket
        Socket socket=new Socket("192.168.1.103",6666);
        //2 获取流
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(),"utf-8"));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(),"utf-8"));
        //3获取用户信息
        String json=getRegistInfo();
        //4发送
        bw.write(json);
        bw.newLine();
        bw.flush();
        //5接收
        String reply=br.readLine();
        System.out.println("服务器回复："+reply);
        //6关闭
        bw.close();
        br.close();
        socket.close();
    }
    public static String getRegistInfo(){
        Scanner input=new Scanner(System.in);
        System.out.println("请输人编号");
        int id=input.nextInt();
        System.out.println("请输入姓名");
        String name =input.next();
        System.out.println("请输入密码");
        String pwd = input.next();
        System.out.println("请输入年龄");
        int age = input.nextInt();
        String json="{id:"+id+",name:"+name+",pwd:"+pwd+",age:"+age+"}";
        return json;
    }

    public static void login()throws Exception{
        //1创建Socket
        Socket socket=new Socket("192.168.1.103",7777);
        //2 获取流
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(),"utf-8"));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(),"utf-8"));
        //3获取用户信息
        String json=getLoginInfo();
        //4发送
        bw.write(json);
        bw.newLine();
        bw.flush();
        //5接收
        String reply=br.readLine();
        System.out.println("服务器回复："+reply);
        //6关闭
        bw.close();
        br.close();
        socket.close();
    }

    public static String getLoginInfo(){
        Scanner input=new Scanner(System.in);
        System.out.println("请输人编号");
        int id=input.nextInt();
        System.out.println("请输入密码");
        String pwd = input.next();

        String json="{id:"+id+ ",pwd:"+  pwd +"}";
        return json;
    }
}
