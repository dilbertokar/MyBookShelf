package com.example.dilber.mybookshelf.Model.second;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Type {
    @SerializedName("key")
    @Expose
    private String key;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
