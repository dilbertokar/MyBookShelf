package com.example.dilber.mybookshelf.Model.IsbnModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BookIsbn {

    @SerializedName("start")
    @Expose
    private Integer start;
    @SerializedName("numof_found")
    @Expose
    private Integer numofFound;
    @SerializedName("numFound")
    @Expose
    private Integer numFound;
    @SerializedName("docs")
    @Expose
    private List<Doc> docs = null;

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getNumofFound() {
        return numofFound;
    }

    public void setNumofFound(Integer numofFound) {
        this.numofFound = numofFound;
    }

    public Integer getNumFound() {
        return numFound;
    }

    public void setNumFound(Integer numFound) {
        this.numFound = numFound;
    }

    public List<Doc> getDocs() {
        return docs;
    }

    public void setDocs(List<Doc> docs) {
        this.docs = docs;
    }
}
