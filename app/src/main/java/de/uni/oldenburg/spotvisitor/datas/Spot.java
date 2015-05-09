package de.uni.oldenburg.spotvisitor.datas;

import android.graphics.drawable.Drawable;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by stubbe on 04.05.2015.
 */
public class Spot implements Serializable{

    private static final long serialVersionUID = 6064086687727213501L;
    private Long id;
    private String description;
    private String name;
    private Date date;
    private List<String> hashtags;
    private int image;
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

    public List<String> getHashtags() {
        return hashtags;
    }

    public void setHashtags(List<String> hashtags) {
        this.hashtags = hashtags;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
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

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        String hashtags = "";
        for (String hashtag : this.hashtags) {
            hashtags += "," + hashtag;
        }
        return name + "," + description + hashtags;
    }
}
