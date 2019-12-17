package com.example.studyjavacore.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @PackageName: com.example.studyjavacore.io
 * @ClassName: FileOutputStreamTest
 * @Description: TODO
 * @author: qiuweijie
 * @date: 2019/12/17  14:32
 */
public class FileOutputStreamTest {
    public static void main(String[] args) {
        try(
                // 创建字节输入流
                FileInputStream fis = new FileInputStream("src/main/java/com/example/studyjavacore/io/FileOutputStreamTest.java");
                // 创建字节输出流
                FileOutputStream fos = new FileOutputStream("src/main/java/com/example/studyjavacore/io/newFile.txt")
                ){
            byte[] bbuf = new byte[32];
            int hasRead =0;
            // 循环从输入流取出数据
            while ((hasRead = fis.read(bbuf)) > 0){
                // 每读取一次，即写入文件输出流，读了多少，就是写多少
                fos.write(bbuf, 0, hasRead);
            }
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
