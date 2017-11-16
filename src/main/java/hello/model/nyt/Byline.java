package hello.model.nyt;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by ryandesmond on 11/2/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Byline {

    String original;

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original;
    }
}
