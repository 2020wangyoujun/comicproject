package com.example.comicsproject.line2.bean;

public class ComicInfo {
    private String comicId;
    private String title;
    private String author;
    private String comicType;
    private String descs;
    private String cover;
    private String updateTime;

    public String getComicId() {
        return comicId;
    }

    public void setComicId(String comicId) {
        this.comicId = comicId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getComicType() {
        return comicType;
    }

    public void setComicType(String comicType) {
        this.comicType = comicType;
    }

    public String getDescs() {
        return descs;
    }

    public void setDescs(String descs) {
        this.descs = descs;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "ComicInfo{" +
                "comicId='" + comicId + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", comicType='" + comicType + '\'' +
                ", descs='" + descs + '\'' +
                ", cover='" + cover + '\'' +
                ", updateTime='" + updateTime + '\'' +
                '}';
    }
}
