package hello.model.nyt;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by ryandesmond on 11/2/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Headline {

    String main;
    String kicker;
    String print_headline;

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getKicker() {
        return kicker;
    }

    public void setKicker(String kicker) {
        this.kicker = kicker;
    }

    public String getPrint_headline() {
        return print_headline;
    }

    public void setPrint_headline(String print_headline) {
        this.print_headline = print_headline;
    }
}
