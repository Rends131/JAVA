package chap16.chap16_4;

import java.io.*;
import java.util.Properties;

/*
工具类
 */
public class Tools {
    //1加载属性文件
    public static Properties loadProperties(){
        //1创建属性集合
        Properties properties=new Properties();
        //2判断文件是否存在
        File file = new File("users.properties");
        if (file.exists()){
            FileInputStream fis= null;
            try {
                fis = new FileInputStream(file);
                properties.load(fis);
            } catch (Exception e) {
                e.printStackTrace();
            }finally {
                if (fis!=null){
                    try {
                        fis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return properties;
    }


    //2保存属性文件
    public static void saveProperties(String json){
        String[] infos = json.substring(1,json.length()-1).split(",");
        String id = infos[0].split(":")[1];
        //保存
        FileOutputStream fos = null;
        try {
            fos=new FileOutputStream("users.properties",true);
            Properties properties=new Properties();
            properties.setProperty(id,json);
            properties.store(fos,"");
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}
