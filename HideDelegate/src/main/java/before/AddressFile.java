package before;

import java.util.Enumeration;

public class AddressFile {

    private final Database _database;

    public AddressFile(String filename) {
        this._database = new Database(filename);
    }

    public Enumeration names(){
        return _database.getProperties().propertyNames();
    }

    public Database getDatabase(){
        return _database;
    }

}
