package practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Day03_03 {
    public static void main(String[] args) throws IOException {
        Day03_03 day0303 = new Day03_03();
        day0303.fileTest("D:\\有效代码统计作业材料");

    }

    public void fileTest (String file) throws IOException {
         File file1=new File(file);
        File[] files = file1.listFiles();

        ArrayList<Integer> arrayList = new ArrayList<>();
        int num;
        for (int i = 0; i <files.length ; i++) {
            File str = files[i];
            num = 0;
            BufferedReader reader = new BufferedReader(new FileReader(files[i]));
            String line = null;
            while ((line = reader.readLine()) !=null){
                num++;
//
            }
            arrayList.add(num);
            System.out.println("文件名:"+files[i]+"行数:"+arrayList.get(i));
            reader.close();
        }
        int nums = 0;
        for (int i = 0; i < arrayList.size() ; i++) {
            
        }


    }

}
