package step1;

public class NullLabel extends Label {


    public NullLabel(String label) {
        super("(none)");
    }

    @Override
    public boolean isNull(){
        return true;
    }


}
