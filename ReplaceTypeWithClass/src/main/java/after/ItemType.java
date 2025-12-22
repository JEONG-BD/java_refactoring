package after;

public class ItemType {
    public final int _typecode;
    public static final ItemType BOOK = new ItemType(0);
    public static final ItemType DVD = new ItemType(1);
    public static final ItemType SOFTWARE = new ItemType(2);

    private ItemType(int typecode) {
        this._typecode = typecode;
    }

    public static ItemType getItemType(int typecode){
        switch (typecode){
            case 0 : return BOOK;
            case 1 : return DVD;
            case 2 : return SOFTWARE;
            default: return null;
        }
    }

    public int getTypecode() {
        return _typecode;
    }
}
