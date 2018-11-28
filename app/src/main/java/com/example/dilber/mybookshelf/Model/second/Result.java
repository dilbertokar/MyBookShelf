package com.example.dilber.mybookshelf.Model.second;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


import java.util.List;

public class Result {

    @SerializedName("identifiers")
    @Expose
    private Identifiers identifiers;
    @SerializedName("subject_place")
    @Expose
    private List<String> subjectPlace = null;
    @SerializedName("covers")
    @Expose
    private List<Integer> covers = null;
    @SerializedName("lc_classifications")
    @Expose
    private List<String> lcClassifications = null;
    @SerializedName("latest_revision")
    @Expose
    private Integer latestRevision;
    @SerializedName("genres")
    @Expose
    private List<String> genres = null;
    @SerializedName("source_records")
    @Expose
    private List<String> sourceRecords = null;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("languages")
    @Expose
    private List<Language> languages = null;
    @SerializedName("subjects")
    @Expose
    private List<String> subjects = null;
    @SerializedName("publish_country")
    @Expose
    private String publishCountry;
    @SerializedName("by_statement")
    @Expose
    private String byStatement;
    @SerializedName("oclc_numbers")
    @Expose
    private List<String> oclcNumbers = null;
    @SerializedName("type")
    @Expose
    private Type type;
    @SerializedName("revision")
    @Expose
    private Integer revision;
    @SerializedName("publishers")
    @Expose
    private List<String> publishers = null;
    @SerializedName("last_modified")
    @Expose
    private LastModified lastModified;
    @SerializedName("key")
    @Expose
    private String key;
    @SerializedName("authors")
    @Expose
    private List<Author> authors = null;
    @SerializedName("publish_places")
    @Expose
    private List<String> publishPlaces = null;
    @SerializedName("pagination")
    @Expose
    private String pagination;
    @SerializedName("created")
    @Expose
    private Created created;
    @SerializedName("dewey_decimal_class")
    @Expose
    private List<String> deweyDecimalClass = null;
    @SerializedName("notes")
    @Expose
    private Notes notes;
    @SerializedName("number_of_pages")
    @Expose
    private Integer numberOfPages;
    @SerializedName("lccn")
    @Expose
    private List<String> lccn = null;
    @SerializedName("isbn_10")
    @Expose
    private List<String> isbn10 = null;
    @SerializedName("publish_date")
    @Expose
    private String publishDate;
    @SerializedName("works")
    @Expose
    private List<Work> works = null;

    public Identifiers getIdentifiers() {
        return identifiers;
    }

    public void setIdentifiers(Identifiers identifiers) {
        this.identifiers = identifiers;
    }

    public List<String> getSubjectPlace() {
        return subjectPlace;
    }

    public void setSubjectPlace(List<String> subjectPlace) {
        this.subjectPlace = subjectPlace;
    }

    public List<Integer> getCovers() {
        return covers;
    }

    public void setCovers(List<Integer> covers) {
        this.covers = covers;
    }

    public List<String> getLcClassifications() {
        return lcClassifications;
    }

    public void setLcClassifications(List<String> lcClassifications) {
        this.lcClassifications = lcClassifications;
    }

    public Integer getLatestRevision() {
        return latestRevision;
    }

    public void setLatestRevision(Integer latestRevision) {
        this.latestRevision = latestRevision;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public List<String> getSourceRecords() {
        return sourceRecords;
    }

    public void setSourceRecords(List<String> sourceRecords) {
        this.sourceRecords = sourceRecords;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Language> getLanguages() {
        return languages;
    }

    public void setLanguages(List<Language> languages) {
        this.languages = languages;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public String getPublishCountry() {
        return publishCountry;
    }

    public void setPublishCountry(String publishCountry) {
        this.publishCountry = publishCountry;
    }

    public String getByStatement() {
        return byStatement;
    }

    public void setByStatement(String byStatement) {
        this.byStatement = byStatement;
    }

    public List<String> getOclcNumbers() {
        return oclcNumbers;
    }

    public void setOclcNumbers(List<String> oclcNumbers) {
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

    public List<String> getPublishers() {
        return publishers;
    }

    public void setPublishers(List<String> publishers) {
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

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public List<String> getPublishPlaces() {
        return publishPlaces;
    }

    public void setPublishPlaces(List<String> publishPlaces) {
        this.publishPlaces = publishPlaces;
    }

    public String getPagination() {
        return pagination;
    }

    public void setPagination(String pagination) {
        this.pagination = pagination;
    }

    public Created getCreated() {
        return created;
    }

    public void setCreated(Created created) {
        this.created = created;
    }

    public List<String> getDeweyDecimalClass() {
        return deweyDecimalClass;
    }

    public void setDeweyDecimalClass(List<String> deweyDecimalClass) {
        this.deweyDecimalClass = deweyDecimalClass;
    }

    public Notes getNotes() {
        return notes;
    }

    public void setNotes(Notes notes) {
        this.notes = notes;
    }

    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public List<String> getLccn() {
        return lccn;
    }

    public void setLccn(List<String> lccn) {
        this.lccn = lccn;
    }

    public List<String> getIsbn10() {
        return isbn10;
    }

    public void setIsbn10(List<String> isbn10) {
        this.isbn10 = isbn10;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public List<Work> getWorks() {
        return works;
    }

    public void setWorks(List<Work> works) {
        this.works = works;
    }
}
