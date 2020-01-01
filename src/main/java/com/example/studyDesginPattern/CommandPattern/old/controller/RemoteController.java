package com.example.studyDesginPattern.CommandPattern.old.controller;

import com.example.studyDesginPattern.CommandPattern.old.device.Light;

/**
 * @PackageName: com.example.studyDesginPattern.CommandPattern.old.controller
 * @ClassName: RemoteController
 * @Description: 遥控
 * @author: qiuweijie
 * @date: 2019/12/30  10:46
 */
public class RemoteController {
    private Light light;

    public RemoteController(Light light) {
        this.light = light;
        buttonObject[0] = light;
    }

    private Object[] buttonObject = new Object[10];

    public Object[] getButtonObject() {
        return buttonObject;
    }

    public void setButtonObject(Object[] buttonObject) {
        this.buttonObject = buttonObject;
    }







}
