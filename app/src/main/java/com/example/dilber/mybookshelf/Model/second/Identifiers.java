package com.example.dilber.mybookshelf.Model.second;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Identifiers {
    @SerializedName("goodreads")
    @Expose
    private List<String> goodreads = null;
    @SerializedName("librarything")
    @Expose
    private List<String> librarything = null;

    public List<String> getGoodreads() {
        return goodreads;
    }

    public void setGoodreads(List<String> goodreads) {
        this.goodreads = goodreads;
    }

    public List<String> getLibrarything() {
        return librarything;
    }

    public void setLibrarything(List<String> librarything) {
        this.librarything = librarything;
    }
}
