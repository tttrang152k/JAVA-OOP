package Q4;

public class Textbook {
    private String title;
    private String author;
    private String publisher;

    Textbook(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    // Getters / Setters (accessors / mutators)
    public String getTitle() { return title; }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() { return author; }
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() { return publisher; }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "\"" + title + "\" by " + author + (publisher.isEmpty() ? "" : " (Publisher: " + publisher + ")");
    }
}
