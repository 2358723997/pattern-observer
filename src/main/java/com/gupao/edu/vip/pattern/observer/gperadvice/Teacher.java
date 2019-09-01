package com.gupao.edu.vip.pattern.observer.gperadvice;

import java.util.Observable;
import java.util.Observer;

/**
 * Teacher类 (观察者)
 *
 * @author wangjixue
 * @date 2019-09-01 15:29
 */
public class Teacher implements Observer {
    /**
     * 老师名称
     */
    public String name;

    public Teacher(String name) {
        this.name = name;
    }

    public void update(Observable o, Object arg) {
        Gper observe =(Gper)o;
        Question question = (Question) arg;
        System.err.println("=============");
        System.err.println(name+"老师，您好，您收到来自"+Gper.GP_COMMUNITY+"的问题，具体内容如下：我是："+question.getUsername()+"我想咨询的问题是："+question.getContent());
    }
}
