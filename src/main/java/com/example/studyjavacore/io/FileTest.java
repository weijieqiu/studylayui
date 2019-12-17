package com.example.studyjavacore.io;

import java.io.File;
import java.io.IOException;

/**
 * @PackageName: com.example.studyjavacore.io
 * @ClassName: FileTest
 * @Description: TODO
 * @author: qiuweijie
 * @date: 2019/12/17  11:29
 */
public class FileTest {
    public static void main(String[] args) throws IOException {
        // 在
        File file = new File("D:\\code\\study\\springBoot\\studylayui\\src\\main\\resources\\file");
        System.out.println(file.getName());
        System.out.println(file.getParent());
        // 获取绝对路径
        System.out.println(file.getAbsoluteFile().getParent());
        // 在当前路径下创建了一个临时文件
        File tempFile = File.createTempFile("aaa", ".txt", file);
        // 指定当 JVM 退出时删除该文件
        tempFile.deleteOnExit();
        // 以系统当前时间作为新文件名来创建新对象
        File newFile = new File(file, System.currentTimeMillis() + ".txt");
        if(!newFile.exists()){
            newFile.createNewFile();
        }
        // 文件过滤器
        String[] nameList = file.list((dir, name) -> name.endsWith(".txt"));
        for(String name : nameList){
            System.out.println(name);
        }



    }
}
