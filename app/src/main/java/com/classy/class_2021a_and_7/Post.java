package com.classy.class_2021a_and_7;

public class Post {

    private String userImageUrl = "";
    private String imageUrl = "";
    private String author = "";
    private String content = "";
    private int likes = 0;

    public Post() { }

    public String getUserImageUrl() {
        return userImageUrl;
    }

    public Post setUserImageUrl(String userImageUrl) {
        this.userImageUrl = userImageUrl;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public Post setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public Post setAuthor(String author) {
        this.author = author;
        return this;
    }

    public String getContent() {
        return content;
    }

    public Post setContent(String content) {
        this.content = content;
        return this;
    }

    public int getLikes() {
        return likes;
    }

    public Post setLikes(int likes) {
        this.likes = likes;
        return this;
    }
}
