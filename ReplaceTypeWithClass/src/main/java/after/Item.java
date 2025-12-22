package after;

public class Item {

    private final ItemType _itemtype;
    private final String _title;
    private final int _price;

    public Item(ItemType itemtype, String title, int price) {
        _title = title;
        _price = price;
        _itemtype = itemtype;
    }

    public int getTypecode() {
        return _itemtype.getTypecode();
    }

    public String getTitle() {
        return _title;
    }

    public int getPrice() {
        return _price;
    }

    public String toString() {
        return "[ "
                + getTypecode() + ", "
                + getTitle() + ", "
                + getPrice() + " ]";
    }
}






