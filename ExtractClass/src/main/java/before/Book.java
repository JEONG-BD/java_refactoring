package before;

public class Book {
    private String _title;
    private String _isbn;
    private String _price;
    private String _authorName;
    private String _authorEmail;

    public Book(String title, String isbn, String price, String authorName, String authorEmail) {
        this._title = title;
        this._isbn = isbn;
        this._price = price;
        this._authorName = authorName;
        this._authorEmail = authorEmail;
    }

    public String getTitle() {
        return _title;
    }

    public String getIsbn() {
        return _isbn;
    }

    public String getPrice() {
        return _price;
    }

    public String getAuthorName() {
        return _authorName;
    }

    public String getAuthorEmail() {
        return _authorEmail;
    }

    public String toXml(){
        String author =
                tag("author", tag("name", _authorName) + tag("mail" , _authorEmail));

        String book =
                tag("book",
                        tag("title", _title)
                        + tag("isbn", _isbn)
                        + tag("price", _price) + author);

        return book;
    }

    public String tag(String element, String content){
        return "<" + element + ">" + content + "</" + element + ">";
    }

}
