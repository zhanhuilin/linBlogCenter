package com.lin.entity.input;

import java.io.Serializable;

/**
 * @author zhanhuilin
 * @date 2021/12/16 - 12:16
 */
public class MenuEntity implements Serializable {
    private String title;

    private String index;

    private String icon;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Override
    public String toString() {
        return "MenuEntity{" +
                "title='" + title + '\'' +
                ", index='" + index + '\'' +
                ", icon='" + icon + '\'' +
                '}';
    }
}
