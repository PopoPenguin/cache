package hello.model.quote;

/*
created by PopoPenguin on 11/16/17
*/


import com.fasterxml.jackson.annotation.JsonProperty;

public class QuoteResponse {

    @JsonProperty("value")
    private Quote quote;

    @JsonProperty("type")
    private String status;

    public Quote getQuote() {
        return quote;
    }

    public void setQuote(final Quote quote) {
        this.quote = quote;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(final String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return String.format("{ @type = %1$s, quote = '%2$s', status = %3$s }",
                getClass().getName(), getQuote(), getStatus());
    }

}
