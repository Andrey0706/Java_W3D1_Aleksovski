package A6;

public class ElectronicBook extends Book {
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ElectronicBook(String name, String description, int price, String author, String url) {
        super(name, description, price, author);
        this.url = url;
    }
}
