package com.gupao.edu.vip.pattern.observer.events.mouseevents;


import com.gupao.edu.vip.pattern.observer.events.code.Event;

/**
 * 自己写的逻辑，用于回调
 * Created by Tom.
 */
public class MouseEventCallback {

    public void onClick(Event e){
        System.err.println("===========触发鼠标单击事件==========" + "\n" + e);
    }

    public void onDoubleClick(Event e){
        System.err.println("===========触发鼠标双击事件==========" + "\n" + e);
    }

    public void onUp(Event e){
        System.err.println("===========触发鼠标弹起事件==========" + "\n" + e);
    }

    public void onDown(Event e){
        System.err.println("===========触发鼠标按下事件==========" + "\n" + e);
    }

    public void onMove(Event e){
        System.err.println("===========触发鼠标移动事件==========" + "\n" + e);
    }

    public void onWheel(Event e){
        System.err.println("===========触发鼠标滚动事件==========" + "\n" + e);
    }

    public void onOver(Event e){
        System.err.println("===========触发鼠标悬停事件==========" + "\n" + e);
    }

    public void onBlur(Event e){
        System.err.println("===========触发鼠标失焦事件==========" + "\n" + e);
    }

    public void onFocus(Event e){
        System.err.println("===========触发鼠标获焦事件==========" + "\n" + e);
    }

}
