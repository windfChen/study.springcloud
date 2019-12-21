package com.windf.study.springcloud.growing.domain;

/**
 * 屏幕信息
 */
public class Screen {
    private int height;             // 屏幕高
    private int width;              // 屏幕宽
    private int windowHeight;       // 窗口高度
    private int windowWidth;        // 窗口宽度

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWindowHeight() {
        return windowHeight;
    }

    public void setWindowHeight(int windowHeight) {
        this.windowHeight = windowHeight;
    }

    public int getWindowWidth() {
        return windowWidth;
    }

    public void setWindowWidth(int windowWidth) {
        this.windowWidth = windowWidth;
    }
}
