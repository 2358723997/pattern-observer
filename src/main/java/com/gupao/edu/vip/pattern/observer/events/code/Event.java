package com.gupao.edu.vip.pattern.observer.events.code;

import lombok.Data;

import java.lang.reflect.Method;

/**
 * Event类
 *
 * @author wangjixue
 * @date 2019-09-01 15:59
 */
public class Event {
    /**
     * 事件源
     */
    private Object source;
    /**
     * 事件接受者
     */
    private Object target;
    /**
     * 回调地址
     */
    private Method callback;
    /**
     * 事件名称
     */
    private String trigger;
    /**
     * 事件触发时间
     */
    private Long time;

    public Event(Object target, Method callback) {
        this.target=target;
        this.callback=callback;
    }

    public Event setTrigger(String trigger) {
        this.trigger = trigger;
        return this;
    }

    public Event setSource(Object source) {
        this.source = source;
        return this;
    }

    public Event setTime(Long time) {
        this.time = time;
        return this;
    }

    public Object getSource() {
        return source;
    }


    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    public Method getCallback() {
        return callback;
    }

    public void setCallback(Method callback) {
        this.callback = callback;
    }

    public String getTrigger() {
        return trigger;
    }


    public Long getTime() {
        return time;
    }


    @Override
    public String toString() {
        return "Event{" +
                "source=" + source +
                ", target=" + target +
                ", callback=" + callback +
                ", trigger='" + trigger + '\'' +
                ", time=" + time +
                '}';
    }
}
