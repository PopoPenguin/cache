package hello.model.nyt;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by ryandesmond on 11/2/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Response {

    Docs[] docs;
    Meta meta;

    public Docs[] getDocs() {
        return docs;
    }

    public void setDocs(Docs[] docs) {
        this.docs = docs;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }
}
