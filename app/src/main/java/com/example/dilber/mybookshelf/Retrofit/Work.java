package com.example.dilber.mybookshelf.Retrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Work {

    @SerializedName("cover_id")
    @Expose
    private Integer coverId;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("lending_edition")
    @Expose
    private String lendingEdition;

    @SerializedName("first_publish_year")
    @Expose
    private Object firstPublishYear;

    @SerializedName("key")
    @Expose
    private String key;

    @SerializedName("authors")
    @Expose
    private ArrayList<Author> authors = null;

    @SerializedName("lending_identifier")
    @Expose
    private String lendingIdentifier;

    @SerializedName("subject")
    @Expose
    private ArrayList<String> subject = null;



    public Integer getCoverId() {
        return coverId;
    }

    public void setCoverId(Integer coverId) {
        this.coverId = coverId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public Object getFirstPublishYear() {
        return firstPublishYear;
    }

    public void setFirstPublishYear(Object firstPublishYear) {
        this.firstPublishYear = firstPublishYear;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList<Author> authors) {
        this.authors = authors;
    }

    public String getLendingEdition() {
        return lendingEdition;
    }

    public void setLendingEdition(String lendingEdition) {
        this.lendingEdition = lendingEdition;
    }



    public String getLendingIdentifier() {
        return lendingIdentifier;
    }

    public void setLendingIdentifier(String lendingIdentifier) {
        this.lendingIdentifier = lendingIdentifier;
    }

    public List<String> getSubject() {
        return subject;
    }

    public void setSubject(ArrayList<String> subject) {
        this.subject = subject;
    }
}
