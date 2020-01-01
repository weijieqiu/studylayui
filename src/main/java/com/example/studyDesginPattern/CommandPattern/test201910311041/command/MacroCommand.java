package com.example.studyDesginPattern.CommandPattern.test201910311041.command;

import java.util.Iterator;
import java.util.Stack;

/**
 * @PackageName: com.example.studyDesginPattern.CommandPattern.test201910311041.command
 * @ClassName: MacroCommand
 * @Description: TODO
 * @author: qiuweijie
 * @date: 2019/12/31  11:13
 */
public class MacroCommand implements Command {
    // 命令的集合
    private Stack commands = new Stack();
    @Override
    public void execute() {
        Iterator iterator = commands.iterator();
        while (iterator.hasNext()){
            ((Command)iterator.next()).execute();
        }
    }

    // 添加命令
    public void add(Command command){
        if(command != this){
            commands.push(command);
        }
    }
    // 撤销命令
    public void undo(Command command){
        if(!commands.empty()){
            commands.pop();
        }
    }
    // 清空命令
    public void clear(){
        commands.clear();
    }
}
