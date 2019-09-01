package com.gupao.edu.vip.pattern.observer.events.code;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * EventListener类
 *
 * @author wangjixue
 * @date 2019-09-01 15:57
 */
public class EventListener {

    private static final String ON = "on";
    // 模拟JDK底层Listener实现逻辑
    private Map<String, Event> events = new HashMap<String, Event>();

    // 事件类型和一个目标对象来触发事件
    public <T> void addListenr(String eventType, Object target) {
        try {
            this.addListenr(eventType, target, target.getClass().getMethod(toUpperFirstMethod(eventType), Event.class));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void addListenr(String eventType, Object target, Method method) {
        // 注册事件
        events.put(eventType, new Event(target, method));
    }

    /**
     * 触发事件
     * @param trigger
     */
    public void trigger(String trigger){
        if(!events.containsKey(trigger)){
            return;
        }
        trigger(events.get(trigger).setTrigger(trigger));

    }

    //触发，只要有动作就触发
    private void trigger(Event event) {
        event.setSource(this);
        event.setTime(System.currentTimeMillis());

        try {
            // 发起回调
            if(null!=event){
                // 用反射调用回调函数
               event.getCallback().invoke(event.getTarget(),event);
            }
        }catch (Exception e){
            e.printStackTrace();
        }


    }

    /**
     * 设置方法名称格式为on+eventType;
     *
     * @param eventType
     * @return
     */
    private String toUpperFirstMethod(String eventType) {
        char[] chars = eventType.toCharArray();
        chars[0] -= 32;
        return EventListener.ON + String.valueOf(chars);
    }


}
