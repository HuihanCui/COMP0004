public class Book extends Product{
    private int code;
    private int price;
    private String author;
    private String title;
    private String publicationDate;

    public Book(int code, int price, String title, String author, String publicationDate){
        super(code, price);
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    public String getDescription(){
        String str = "The book " + title + " is by " + author + " on " + publicationDate;
        return str;
    }
}
