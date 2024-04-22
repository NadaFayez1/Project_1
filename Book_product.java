public class Book_product extends product{
    private String author;
    private String publisher;

    public Book_product(){

    }
    public Book_product(int productID, String name, double price, String author, String publisher) {
        super(productID, name, price);
        this.author = author;
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
