package after;

public class Author {
    private String _name;
    private String _mail;

    public Author(String name, String mail) {
        this._name = name;
        this._mail = mail;
    }

    public String getName() {
        return _name;
    }

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
