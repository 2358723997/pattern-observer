package com.gupao.edu.vip.pattern.observer.events.mouseevents;


import com.gupao.edu.vip.pattern.observer.events.code.EventListener;

/**
 * Created by Tom.
 */
public class Mouse extends EventListener {

    public void click(){
        System.out.println("调用单击方法");
        this.trigger(MouseEventType.ON_CLICK.getValue());
    }

    public void doubleClick(){
        System.out.println("调用双击方法");
        this.trigger(MouseEventType.ON_DOUBLE_CLICK.getValue());
    }

    public void up(){
        System.out.println("调用弹起方法");
        this.trigger(MouseEventType.ON_UP.getValue());
    }

    public void down(){
        System.out.println("调用按下方法");
        this.trigger(MouseEventType.ON_DOWN.getValue());
    }

    public void move(){
        System.out.println("调用移动方法");
        this.trigger(MouseEventType.ON_MOVE.getValue());
    }

    public void wheel(){
        System.out.println("调用滚动方法");
        this.trigger(MouseEventType.ON_WHEEL.getValue());
    }

    public void over(){
        System.out.println("调用悬停方法");
        this.trigger(MouseEventType.ON_OVER.getValue());
    }

    public void blur(){
        System.out.println("调用获焦方法");
        this.trigger(MouseEventType.ON_BLUR.getValue());
    }

    public void focus(){
        System.out.println("调用失焦方法");
        this.trigger(MouseEventType.ON_FOCUS.getValue());
    }
}
