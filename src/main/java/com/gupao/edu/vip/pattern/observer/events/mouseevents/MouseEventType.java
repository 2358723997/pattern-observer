package com.gupao.edu.vip.pattern.observer.events.mouseevents;

/**
 * MouseEventType类
 *
 * @author wangjixue
 * @date 2019-09-01 16:43
 */
public enum MouseEventType {
    /**
     * 单击
     */

    ON_CLICK("click"),
    /**
     * 双击
     */

    ON_DOUBLE_CLICK("doubleClick"),
    /**
     * 弹起
     */
    ON_UP("up"),

    /**
     * 按下
     */
    ON_DOWN("down"),

    /**
     * 移动
     */
    ON_MOVE("move"),

    /**
     * 滚动
     */
    ON_WHEEL("wheel"),

    /**
     * 悬停
     */
    ON_OVER("over"),

    /**
     * 失焦
     */
    ON_BLUR("blur"),

    /**
     * 获焦
     */
    ON_FOCUS("focus");

    private String value;

    MouseEventType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
