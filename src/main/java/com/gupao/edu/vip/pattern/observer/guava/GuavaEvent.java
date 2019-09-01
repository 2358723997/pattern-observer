package com.gupao.edu.vip.pattern.observer.guava;

import com.google.common.eventbus.Subscribe;

/**
 * GuavaEvent类
 *
 * @author wangjixue
 * @date 2019-09-01 16:58
 */
public class GuavaEvent {
    @Subscribe
    public void subscribe(String event){
        System.err.println("invoke subscribe, parameter is "+event);
    }
}
