package com.example.studyjavacore.io;



import java.io.FileInputStream;
import java.io.IOException;

/**
 * @PackageName: com.example.studyjavacore.io
 * @ClassName: FileInputStreamTest
 * @Description: TODO
 * @author: qiuweijie
 * @date: 2019/12/17  14:08
 */
public class FileInputStreamTest {
    public static void main(String[] args) throws IOException {
        // 创建字节输入流
        FileInputStream fis = new FileInputStream("src/main/java/com/example/studyjavacore/io/FileInputStreamTest.java");
        // 创建一个长度为 1024 的 "竹筒"
        byte[] bbuf = new byte[512];
        // 用于保存实际读取的字节数
        int hasRead = 0;
        while ((hasRead = fis.read(bbuf)) > 0) {
            // 取出 "竹筒"中的水滴(字节), 将字节数组转换为字符串输入
            System.out.print(new String(bbuf, 0, hasRead));
        }
        fis.close();
    }
}
