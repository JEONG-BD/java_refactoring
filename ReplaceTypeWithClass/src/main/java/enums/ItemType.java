package enums;

public enum ItemType {
    BOOK(0),
    DVD(1),
    SOFTWARE(2);

    private final int _typecode;

    ItemType(int _typecode) {
        this._typecode = _typecode;
    }

    public int getTypecode() {
        return _typecode;
    }
}
