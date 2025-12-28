package after;

import java.util.ArrayList;
import java.util.List;

public class Value {

    private final List<ValueLinstener> _listeners = new ArrayList<ValueLinstener>();

    private int _value = 0;
    public Value(int value){
        _value  = value;
    }

    public void setValue(int value) {
        this._value = value;
        notifyTOListeners();
    }

    private void notifyTOListeners() {
        for (ValueLinstener listener : _listeners) {
            listener.valueChanged(new ValueChangeEvent(this));
        }
    }

    public int getValue() {
        return _value;
    }

    public void addValueListener(ValueLinstener listener){
        _listeners.add(listener);
    }
}
