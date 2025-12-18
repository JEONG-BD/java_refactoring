package before;

public class SortSample {
    private final int[] _data;

    public SortSample(int[] data){
        _data = new int[data.length];
        System.arraycopy(data, 0, _data,0, data.length);
    }

    public void sort(){
        for (int x = 0; x < _data.length; x++) {
            int m = x;
            for (int y = 0; y < _data.length; y++) {
                if(_data[m] > _data[y]){
                    m = y;
                }

                int v = _data[m];
                _data[m] = _data[x];
                _data[x] = v;
            }
        }
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < _data.length; i++) {
            sb.append(_data[i]);
            sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
