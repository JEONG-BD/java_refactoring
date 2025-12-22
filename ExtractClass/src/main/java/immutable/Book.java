package immutable;


public class Book {
    private String _title;
    private String _isbn;
    private String _price;

    private Author _author;

    public Book(String title,
                String isbn,
                String price,
                String authorName,
                String authorMail) {
        this._title = title;
        this._isbn = isbn;
        this._price = price;
        _author = new Author( authorName, authorMail);
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
        return _author.getName();
    }

    public String getAuthorEmail() {
        return _author.getMail();
    }

    public ImmutableAuthor getAauthor(){
        return _author;
    }

    public void setAuthorName(String name) {
        _author.setName(name);
    }

    public void setAuthorEmail(String email) {
        _author.setMail(email);
    }



    public String toXml(){
        String author =
                tag("author",
                        tag("name", _author.getName())
                                + tag("mail" , _author.getMail()));

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
