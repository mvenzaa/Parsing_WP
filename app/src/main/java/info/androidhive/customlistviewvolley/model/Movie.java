package info.androidhive.customlistviewvolley.model;

import java.util.ArrayList;

public class Movie {
    private String title, featured_image_Url;
    private int ID;
    private String author;

    public Movie(){
    }

    public Movie(String name, String featured_image_Url, int ID, String author) {
        this.title = name;
        this.featured_image_Url = featured_image_Url;
        this.ID = ID;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name){
        this.title = name;
    }

    public String getFeatured_image_Url() {
        return featured_image_Url;
    }

    public void setFeatured_image_Url(String featured_image_url) {
        this.featured_image_Url = featured_image_url;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}
