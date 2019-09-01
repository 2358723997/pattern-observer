package com.gupao.edu.vip.pattern.observer.gperadvice;

import java.util.Observable;

/**
 * Gper类
 *
 *  JDK提供的一种观察者的实现方式，被观察者
 * @author wangjixue
 * @date 2019-09-01 15:10
 */
public class Gper extends Observable {
    public static final String GP_COMMUNITY="GPer社区";

    private static Gper gper;

    public Gper() {
    }

    public static Gper getInstance(){
        if(null==gper){
            gper = new Gper();
        }
        return gper;
    }



    public void publishQuestion(Question question){
        System.err.println(question.getUsername()+"在"+GP_COMMUNITY+"上提交了一个问题");
        setChanged();
        notifyObservers(question);
    }

}
