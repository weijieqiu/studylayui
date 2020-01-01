package com.example.studyDesginPattern.CommandPattern.test201910311041.command;







import java.awt.*;

/**
 * @PackageName: com.example.studyDesginPattern.CommandPattern.test201910311041.command
 * @ClassName: DrawCommand
 * @Description: TODO
 * @author: qiuweijie
 * @date: 2019/12/31  11:31
 */
public class DrawCommand implements Command{
    // 绘制对象
    protected Drawable drawable;
    // 绘制位置
    private Point position;

    //构造函数
    public DrawCommand(Drawable drawable, Point position){
        this.drawable = drawable;
        this.position = position;
    }
    @Override
    public void execute() {
        drawable.draw(position.x, position.y);
    }
}
