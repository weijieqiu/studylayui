package com.example.studyDesginPattern.CommandPattern.old;

import com.example.studyDesginPattern.CommandPattern.old.controller.RemoteController;
import com.example.studyDesginPattern.CommandPattern.old.device.Light;

/**
 * @PackageName: com.example.studyDesginPattern.CommandPattern
 * @ClassName: Main
 * @Description: TODO
 * @author: qiuweijie
 * @date: 2019/12/30  10:57
 */
public class Main {
    public static void main(String[] args) {
        // 1. 实例化电灯对象
        Light light = new Light("客厅的灯");

        // 2. 填充遥控器按钮
        RemoteController remoteController = new RemoteController(light);
        Object[] buttonObject = remoteController.getButtonObject();
        System.out.println("遥控器上的第一个按钮为: " + ((Light) buttonObject[0]).getName() +
                "当前灯的状态: " +(((Light) buttonObject[0]).isFlag() ? "打开状态" : "关闭状态")) ;
        ((Light)buttonObject[0]).on();
        System.out.println("遥控器上的第一个按钮为: " + ((Light) buttonObject[0]).getName() +
                "当前灯的状态: " +(((Light) buttonObject[0]).isFlag() ? "打开状态" : "关闭状态")) ;
    }
}
