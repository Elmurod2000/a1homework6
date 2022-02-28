package com.example.a1homework6;

public class Model {
    private String number;
    private String songs;
    private String author;
    private String time;

    public Model(String number, String songs, String author, String time) {
        this.number = number;
        this.songs = songs;
        this.author = author;
        this.time = time;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSongs() {
        return songs;
    }

    public void setSongs(String songs) {
        this.songs = songs;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
