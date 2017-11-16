package hello.model.greeting;

public class Greeting {

    private final String content;

    public Greeting(String content) {
        this.content = content;
    }

    public String getContent() {
        return "Hello, " + content + "!";
    }
}
