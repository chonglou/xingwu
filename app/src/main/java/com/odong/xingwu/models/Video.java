package com.odong.xingwu.models;

import java.io.Serializable;

/**
 * Created by flamen on 15-4-15.
 */
public class Video implements Serializable {

    private String vid;
    private String title;

    public String getVid() {
        return vid;
    }

    public void setVid(String vid) {
        this.vid = vid;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
