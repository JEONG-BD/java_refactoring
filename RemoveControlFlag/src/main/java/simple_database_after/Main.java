package simple_database_after;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        try {
            InputStream is = Main.class
                    .getClassLoader()
                    .getResourceAsStream("dbfile.txt");

            if (is == null) {
                throw new IllegalStateException("dbfile.txt not found in resources");
            }
            SimpleDatabase db = new SimpleDatabase(new InputStreamReader(is));
            Iterator<String> it = db.iterator();
            while (it.hasNext()){
                String key = it.next();
                System.out.println("key \"" + key  + "\"");
                System.out.println("Value \"" + db.getValue(key)  + "\"");
                System.out.println();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
