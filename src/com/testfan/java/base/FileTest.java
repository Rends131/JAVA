package com.testfan.java.base;

import java.io.*;

public class FileTest {
    public static void main(String[] args) throws IOException {
        FileTest f = new FileTest();
//        f.fileTest();

        f.fileInputTest();
//        f.outputSteamTest();
//        f.readerTest();

//        f.writeTest();
    }
    public void fileInputTest() throws IOException {
        FileInputStream inputStream = new FileInputStream("D:\\有效代码统计/ActionController.java");
//        int len = inputStream.read();
//        System.out.println(len);
        byte[] by = new byte[1024];
        //循环读取文本，只能是txt格式，其他格式会乱码
        while (inputStream.read(by)!=-1){
            //字节数组转字符串
            String data = new String(by);
            System.out.println(data);
        }
        inputStream.close();

    }

    public void outputSteamTest() throws IOException {
        FileOutputStream outputStream = new FileOutputStream("D://aaa.txt");
        String info = "werewrew";
        outputStream.write(info.getBytes());
        outputStream.close();
    }

    public void readerTest() throws IOException {
        BufferedReader reader=new BufferedReader(new FileReader("D:\\有效代码统计作业材料/ActionController.java"));
        String line = null;
        System.out.println("文件长度是"+reader.lines());
        int i=0;

        while ((line = reader.readLine()) !=null){
            i++;

            System.out.println(line);

        }
        System.out.println("文件的总行数是："+i);
        reader.close();

    }

    public void writeTest() throws IOException {
        //true代表 追加，不写true会覆盖
        BufferedWriter writer = new BufferedWriter(new FileWriter("D://aaa.txt",true));
        writer.write("very good");
        writer.newLine();
        writer.close();
    }

    public void fileTest() throws IOException {
        File file1 = new File("D://aaa.xlsx");
        File file2 = new File("D://性能");

        System.out.println(file1.isFile());
        System.out.println(file2.isDirectory());
        System.out.println(file1.canExecute());
        System.out.println(file1.getName());

//        File file3 = new File("D://sut.bin");
//        file3.createNewFile();
//        file3.delete();

        File[] files = file2.listFiles();
        for(File file :files){
            System.out.println(file.getName());
        }
    }
}
