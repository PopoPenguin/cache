package hello.model.nyt;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by ryandesmond on 11/2/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ArticleSearchResponse {

    String status;
    String copyright;
    Response response;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }
}
