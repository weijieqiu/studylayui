package com.example.studyjavacore.io;

import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

/**
 * @PackageName: com.example.studyjavacore.io
 * @ClassName: PushbackTest
 * @Description: TODO
 * @author: qiuweijie
 * @date: 2019/12/17  15:07
 */
public class PushbackTest {
    public static void main(String[] args) throws IOException {
        try(
                // 创建一个 PushbackReader 对象，指定推回缓冲区的长度为 64
                PushbackReader pr = new PushbackReader(new FileReader("src/main/java/com/example/studyjavacore/io/PushbackTest.java"), 64)
                ){
                    char[] buf = new char[32];
                    // 用以保存下次读取的字符串内容
            String lastContent = "";
            int hasRead = 0;
            // 循环读取文件内容
            while ((hasRead = pr.read(buf)) > 0){
                // 将读取的内容转换为字符串
                String content = new String(buf, 0, hasRead);
                int targetIndex = 0;
                // 将上次读取的字符串和本次读取的字符串拼起来
                // 查看是否包含目标字符串，如果包含目标字符串
                if((targetIndex = (lastContent + content).indexOf("new PushbackReader")) > 0){
                    // 将本次内容和上次内容一起推回缓冲区
                    pr.unread((lastContent + content).toCharArray());
                    if(targetIndex > 32){
                        buf = new char[targetIndex];
                    }
                    // 再次读取指定长度的内容
                    pr.read(buf,0, targetIndex);
                    System.out.print(new String(buf, 0, targetIndex));
                    System.exit(0);
                }else {
                    System.out.print(lastContent);
                    lastContent = content;
                }
            }
        }
    }
}
