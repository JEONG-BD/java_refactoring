package field;

public class Label {
    private final String _label;
    private static final Label NULL = new NullLabel();
    public Label(String label) {
        _label = label;
    }

    public void display() {
        System.out.println("display: " + _label);
    }

    public String toString() {
        return "\"" + _label + "\"";
    }

    public boolean isNull() {
        return false;
    }


    public static class NullLabel extends Label {

        public NullLabel() {
            super("(none)");
        }

        @Override
        public boolean isNull() {
            return true;
        }

        @Override
        public void display() {

        }

    }
}

