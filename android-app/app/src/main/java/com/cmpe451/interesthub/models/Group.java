package com.cmpe451.interesthub.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by eren on 28.10.2017.
 */

public class Group {
    
    @SerializedName("id")
    long id;
    @SerializedName("url")
    String url;
    @SerializedName("name")
    String name;

    @SerializedName("description")
    String desc;

    @SerializedName("image")
    String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
