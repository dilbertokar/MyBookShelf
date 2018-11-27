package com.example.dilber.mybookshelf.Retrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class Result {

    @SerializedName("covers")
    @Expose
    private ArrayList<Integer> covers = null;

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("languages")
    @Expose
    private ArrayList<Language> languages = null;
    @SerializedName("subjects")
    @Expose
    private ArrayList<String> subjects = null;
    @SerializedName("publish_country")
    @Expose
    private String publishCountry;

    @SerializedName("oclc_numbers")
    @Expose
    private ArrayList<String> oclcNumbers = null;
    @SerializedName("type")
    @Expose
    private Type type;
    @SerializedName("revision")
    @Expose
    private Integer revision;
    @SerializedName("publishers")
    @Expose
    private ArrayList<String> publishers = null;
    @SerializedName("last_modified")
    @Expose
    private LastModified lastModified;
    @SerializedName("key")
    @Expose
    private String key;
    @SerializedName("authors")
    @Expose
    private ArrayList<Author> authors = null;
    @SerializedName("publish_places")
    @Expose
    private ArrayList<String> publishPlaces = null;

    @SerializedName("number_of_pages")
    @Expose
    private Integer numberOfPages;

    @SerializedName("isbn_10")
    @Expose
    private ArrayList<String> isbn10 = null;
    @SerializedName("publish_date")
    @Expose
    private String publishDate;
    @SerializedName("works")
    @Expose
    private ArrayList<Work> works = null;

    public ArrayList<Integer> getCovers() {
        return covers;
    }

    public void setCovers(ArrayList<Integer> covers) {
        this.covers = covers;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Language> getLanguages() {
        return languages;
    }

    public void setLanguages(ArrayList<Language> languages) {
        this.languages = languages;
    }

    public ArrayList<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<String> subjects) {
        this.subjects = subjects;
    }

    public String getPublishCountry() {
        return publishCountry;
    }

    public void setPublishCountry(String publishCountry) {
        this.publishCountry = publishCountry;
    }


    public ArrayList<String> getOclcNumbers() {
        return oclcNumbers;
    }

    public void setOclcNumbers(ArrayList<String> oclcNumbers) {
        this.oclcNumbers = oclcNumbers;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Integer getRevision() {
        return revision;
    }

    public void setRevision(Integer revision) {
        this.revision = revision;
    }

    public ArrayList<String> getPublishers() {
        return publishers;
    }

    public void setPublishers(ArrayList<String> publishers) {
        this.publishers = publishers;
    }

    public LastModified getLastModified() {
        return lastModified;
    }

    public void setLastModified(LastModified lastModified) {
        this.lastModified = lastModified;
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

    public ArrayList<String> getPublishPlaces() {
        return publishPlaces;
    }

    public void setPublishPlaces(ArrayList<String> publishPlaces) {
        this.publishPlaces = publishPlaces;
    }


    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public ArrayList<String> getIsbn10() {
        return isbn10;
    }

    public void setIsbn10(ArrayList<String> isbn10) {
        this.isbn10 = isbn10;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public ArrayList<Work> getWorks() {
        return works;
    }

    public void setWorks(ArrayList<Work> works) {
        this.works = works;
    }
}
