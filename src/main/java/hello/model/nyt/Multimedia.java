package hello.model.nyt;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by ryandesmond on 11/2/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Multimedia {
    String type;
    String subtype;
    String url;
    int height;
    int width;
    int rank;
    Legacy legacy;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public Legacy getLegacy() {
        return legacy;
    }

    public void setLegacy(Legacy legacy) {
        this.legacy = legacy;
    }
}
