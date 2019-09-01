package com.gupao.edu.vip.pattern.observer.gperadvice;

import lombok.Data;

/**
 * Question类
 *
 * @author wangjixue
 * @date 2019-09-01 15:27
 */
@Data
public class Question {
    /**
     * 提问者
     */
    private String username;

    /**
     * 问题内容
     */
    private String content;

    public Question(String username, String content) {
        this.username = username;
        this.content = content;
    }
}
