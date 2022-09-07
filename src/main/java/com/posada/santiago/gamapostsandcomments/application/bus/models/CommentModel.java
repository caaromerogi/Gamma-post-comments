package com.posada.santiago.gamapostsandcomments.application.bus.models;

public class CommentModel {
    private String postId;
    private String id;
    private String author;
    private String content;

    public CommentModel() {
    }

    public CommentModel(String postId, String id, String author, String content) {
        this.postId = postId;
        this.id = id;
        this.author = author;
        this.content = content;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "CommentModel{" +
                "postId='" + postId + '\'' +
                ", id='" + id + '\'' +
                ", author='" + author + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
