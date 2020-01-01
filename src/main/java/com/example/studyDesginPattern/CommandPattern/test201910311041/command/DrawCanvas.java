package com.example.studyDesginPattern.CommandPattern.test201910311041.command;

import java.awt.*;

/**
 * @PackageName: com.example.studyDesginPattern.CommandPattern.test201910311041.command
 * @ClassName: DrawCanvas
 * @Description: TODO
 * @author: qiuweijie
 * @date: 2019/12/31  11:36
 */
public class DrawCanvas extends Canvas implements Drawable {
    // 颜色
    private Color color = Color.RED;
    // 要绘制的圆点的半径
    private int radius = 6;
    // 命令的历史记录
    private MacroCommand history;

    public DrawCanvas(int width, int height, MacroCommand history) {
        setSize(width, height);
        //setBackground(Color);
        this.history = history;
    }

    @Override
    public void draw(int x, int y) {

    }
}
