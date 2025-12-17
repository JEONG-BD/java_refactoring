package simple_database_before;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SimpleDatabase {
    private Map<String, String> _map = new HashMap<>();

    public SimpleDatabase(Reader r1) throws IOException {
        BufferedReader r2 = new BufferedReader(r1);
        boolean flag = false;
        String tmp;

        while (!flag){
            tmp = r2.readLine();
            if(tmp == null){
                flag = true;
            } else {
                boolean flag2 = true;
                StringBuilder sb1 = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                for (int i = 0; i < tmp.length(); i++) {
                    char tmp2 = tmp.charAt(i);
                    if (flag2) {
                        if (tmp2 == '=') {
                            flag2 = false;
                        } else {
                            sb1.append(tmp2);
                        }
                    } else {
                        sb2.append(tmp2);
                    }
                }
                String ss1 = sb1.toString();
                String ss2 = sb2.toString();
                _map.put(ss1,  ss2);
            }
        }
    }



    public void putValue(String key, String value){
        _map.put(key, value);
    }

    public String getValue(String key) {
        return _map.get(key);
    }

    public Iterator<String> iterator(){
        return _map.keySet().iterator();
    }
}
