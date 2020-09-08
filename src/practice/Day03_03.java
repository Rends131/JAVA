package practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Day03_03 {
    private static final String hhf = "";

    public static void main(String[] args) throws IOException {
        Day03_03 day0303 = new Day03_03();
        day0303.fileTest("D:\\有效代码统计");

    }

    public void fileTest(String file) throws IOException {
        File file1 = new File(file);
        File[] files = file1.listFiles();

        ArrayList<Integer> arrayList = new ArrayList<>();
        int num;
        for (int i = 0; i < files.length; i++) {
            File str = files[i];
            num = 0;

            BufferedReader reader = new BufferedReader(new FileReader(files[i]));
            String line = null;
            while ((line = reader.readLine()) != null) {
                if (!hhf.equals(line)) {
                    num++;
                }
            }
            arrayList.add(num);
            System.out.println("文件名:" + files[i] + "行数:" + arrayList.get(i));
            reader.close();
        }
        int nums = 0;
        for (int i = 0; i < arrayList.size(); i++) {

        }




    }

    public Integer getVaildCodeCount(String dir) {
        if (dir == null) {
            throw new RuntimeException("参数为空");
        }
        if (dir.length() == 0) {
            throw new RuntimeException("参数长度为空");
        }

        File dirFile = new File(dir);

        if (!dirFile.isDirectory()) {
            throw new RuntimeException("参数不是有效目录");
        }
        int codeCount = 0;
        File[] files = dirFile.listFiles();
        for (File file : files) {
            if (file.isFile() && file.getName().endsWith(".java")) {
                // 创建字符流文件
                BufferedReader reader = null;
                try {
                    // 设置多行注释的开始标记
                    boolean flag = false;
                    reader = new BufferedReader(new FileReader(file));
                    String line = null;
                    while ((line = reader.readLine()) != null) {
                        line = line.trim();
                        // 单行注释
                        if (line.length() == 0 || line.startsWith("//")) {
                            continue;
                        }
                        // 修改多行注释起始标记为true
                        if (line.startsWith("/*")) {
                            flag = true;
                        }
                        if (flag) {
                            // 在有多行注释起始标记前提下，如果遇到注释结束符，设置标记为false
                            if (line.startsWith("*/") || line.endsWith("*/")) {
                                flag = false;
                            }
                            // 跳过本行
                            continue;
                        }
                        codeCount++;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    if (reader != null) {
                        try {
                            reader.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }

            }
        }
        return codeCount;
    }

}
