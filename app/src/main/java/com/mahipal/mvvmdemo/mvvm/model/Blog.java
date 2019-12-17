package com.mahipal.mvvmdemo.mvvm.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Blog {

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("pubDate")
    @Expose
    private String pubDate;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("author")
    @Expose
    private String author;
    @SerializedName("thumbnail")
    @Expose
    private String thumbnail;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("guid")
    @Expose
    private String guid;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

}