package step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class CSVStringReader extends CSVReader {


    public CSVStringReader(String string) {
        super(new BufferedReader((new StringReader(string))));
    }

    @Override
    public String[] readCSV() throws IOException {

        String line = _bufReader.readLine();
        if(line == null){
            return null;
        }else {
            String[] item = CSV_PATTERN.split(line);
            return item;
        }
    }

    @Override
    public void close() throws IOException {
        _bufReader.close();
    }
}
