package immutable;

public class Author implements ImmutableAuthor{
    private String _name;
    private String _mail;

    public Author(String name, String mail) {
        this._name = name;
        this._mail = mail;
    }

    @Override
    public String getName() {
        return _name;
    }

    @Override
    public String getMail() {
        return _mail;
    }

    public void setName(String name) {
        this._name = name;
    }

    public void setMail(String mail) {
        this._mail = mail;
    }

}
