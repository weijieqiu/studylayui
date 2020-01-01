package com.example.studyDesginPattern.CommandPattern.old.device;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @PackageName: com.example.studyDesginPattern.CommandPattern.old.device
 * @ClassName: Light
 * @Description: TODO
 * @author: qiuweijie
 * @date: 2019/12/30  10:49
 */

@Data
@AllArgsConstructor
public class Light {
    private String name;
    private boolean flag = false;       // 点灯状态标志位
    public Light() {
    }



    public Light(String name) {
        this.name = name;
    }

    public void on(){
        if(!flag){
            System.out.println("打开状态.....");
            flag = true;
        }else {
            System.out.println("打开失败，当前状态已经的打开的了");
        }

    }

    public void close(){
        if(flag){
            System.out.println("关闭状态.....");
            flag = false;
        }else {
            System.out.println("关闭是失败，当前状态已经是关闭的了");
        }

    }

    @Override
    public String toString() {
        return "Light{" +
                "name='" + name + '\'' +
                ", flag=" + flag +
                '}';
    }
}
