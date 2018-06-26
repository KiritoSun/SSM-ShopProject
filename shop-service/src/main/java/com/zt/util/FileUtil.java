package com.zt.util;

import org.apache.log4j.Logger;

import java.io.*;

public class FileUtil {
    private static Logger log = Logger.getLogger(FileUtil.class);

    public static String read(File file){
        FileReader reader = null;
        BufferedReader buff = null;
        String str = "";
        try{
            reader = new FileReader(file);
            buff = new BufferedReader(reader);
            str = buff.readLine();
        }catch (IOException e){
            e.printStackTrace();
            log.error("读取文件"+file.getName()+"出现IO异常！");
        }finally {}
        return str;
    }

    public static void write(File file, String m){
        FileWriter writer = null;
        BufferedWriter buff = null;
        try{
            writer = new FileWriter(file);
            buff = new BufferedWriter(writer);
            buff.write(m);
            buff.close();
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
            log.error("写入文件"+file.getName()+"出现IO异常！");
        }finally {}
    }
}
