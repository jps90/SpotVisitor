package de.uni.oldenburg.spotvisitor.datas;

import android.graphics.drawable.Drawable;

import java.util.Date;
import java.util.List;

/**
 * Created by stubbe on 04.05.2015.
 */
public class Spot {
    private String description;
    private String name;
    private Date date;
    private List<String> hastags;
    private Drawable image;
    private String locationname;
    private String user;
    private String gps;
    private int rating;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<String> getHastags() {
        return hastags;
    }

    public void setHastags(List<String> hastags) {
        this.hastags = hastags;
    }

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }

    public String getLocationname() {
        return locationname;
    }

    public void setLocationname(String locationname) {
        this.locationname = locationname;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }

    public void setRating(int rating){
        this.rating = rating;
    }

    public int getRating(){
        return rating;
    }
}
